package com.jsz.peini.thread;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.jsz.peini.bean.UserInfo;
import com.jsz.peini.bean.UserLogin;
import com.jsz.peini.bean.UserLoginCustom;
import com.jsz.peini.bean.WxFestivalAward;

import com.jsz.peini.component.HttpClientComponent;
import com.jsz.peini.mapper.UserInfoMapper;
import com.jsz.peini.mapper.UserLoginMapper;
import com.jsz.peini.mapper.WxFestivalAwardMapper;
import com.jsz.peini.service.GoldService;
import com.jsz.peini.service.SmsService;
import com.jsz.peini.service.UserService;
import com.jsz.peini.service.WxFestivalAwardService;
import com.jsz.peini.util.common.StringUtil;
import com.jsz.peini.util.constant.Config;
import com.jsz.peini.util.constant.Constants;
import com.jsz.peini.util.constant.RedisKey;

public class FestivalAwardQueueThread extends Thread {
	private Logger logger = LogManager.getLogger(FestivalAwardQueueThread.class);
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private WxFestivalAwardService wxFestivalAwardService;
	@Autowired
	private WxFestivalAwardMapper wxFestivalAwardMapper;
	@Autowired
	private HttpClientComponent httpClientComponent;
	@Autowired
	private UserLoginMapper userLoginMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private GoldService goldService;
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private SmsService smsService;

	private Integer blockTimeOut;
	private Integer maxAwardId;
	private volatile boolean shutdown;
	public FestivalAwardQueueThread(Integer blockTimeOut,Integer maxAwardId) {
		this.blockTimeOut = blockTimeOut;
		this.maxAwardId = maxAwardId;
	}

	public void init(){
		this.start();
	}
	public void shutdown() {
		this.shutdown = true;
		logger.debug("SpringApplication is destroyed,FestivalAwardQueueThread will stop!!!");
	}
	@Override
	public void run() {
		while (!shutdown) {
			String awardId = null;
			try {
				awardId = stringRedisTemplate.opsForList().leftPop(RedisKey.wx_award_queue, this.blockTimeOut, TimeUnit.SECONDS);
				if (Integer.valueOf(awardId).intValue()>this.maxAwardId) {
					throw new RuntimeException("redis发奖队列==>>"+awardId);
				}
				logger.info("*******************************进入奖品发放流程**********************************************");
				logger.info("开始给awardId==>>[" + awardId + "]发奖");
				if (awardId != null) {
					Integer award = Integer.valueOf(awardId);
					WxFestivalAward wxFestivalAward = wxFestivalAwardMapper.selectByPrimaryKey(award);
					if (wxFestivalAward.getAwardType().intValue() == 1) {
						// 现金发放
						TreeMap<String, String> treeMap = new TreeMap<String, String>();
						treeMap.put("nonce_str", StringUtil.getUUID());//随机字符串
						treeMap.put("mch_billno", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+String.valueOf(wxFestivalAward.getId().intValue()));//奖品编号
						treeMap.put("mch_id", Config.weixin_payno_mch_id);//商户号
						treeMap.put("wxappid", Config.weixin_serverno_appid);//公众号appId
						treeMap.put("send_name", "金手指集团");//商户名称
						treeMap.put("re_openid", wxFestivalAward.getOpenId());//用户openid
						treeMap.put("total_amount", String.valueOf(wxFestivalAward.getAwardContent().multiply(new BigDecimal("100")).longValue()));//付款金额
						treeMap.put("total_num", "1");//红包发放总人数
						treeMap.put("wishing", "金手指集团祝您新年快乐");//红包祝福语
						treeMap.put("client_ip", Config.weixin_payno_client_ip);
						treeMap.put("act_name", wxFestivalAward.getActivityName());//活动名称
						treeMap.put("remark", "金手指集团现金红包");//备注
						String requestXml = StringUtil.getSignXml(treeMap);
						String responseXml = httpClientComponent.getHttpSSLPost(Config.weixin_serverno_https_scheme, Config.weixin_payno_api_host, Config.weixin_payno_sendredpack_path,null, requestXml);
						Map<String, String> hashMap = StringUtil.formatWxXmlToMap(responseXml);
						logger.debug(hashMap);
						if (!hashMap.get("return_code").equals("SUCCESS")) {
							throw new RuntimeException(responseXml);
						}
					} else if (wxFestivalAward.getAwardType().intValue() == 2) {
						// 金豆发放
						List<UserLogin> loginList = userLoginMapper.selectByUserName(wxFestivalAward.getRemainPhone());
						if (loginList.size()==0) {
							UserLoginCustom userLoginCustom = new UserLoginCustom();
							userLoginCustom.setUserName(wxFestivalAward.getRemainPhone());
							String password = userService.userRegister(userLoginCustom);
							smsService.sendPassword(wxFestivalAward.getRemainPhone(), password, Constants.PN_PASSWORD);
						}
						UserInfo userInfo= userInfoMapper.selectByUserPhone(wxFestivalAward.getRemainPhone());
						goldService.importGold(userInfo, wxFestivalAward.getAwardContent());
					}
					wxFestivalAwardService.awardProvideFinish(award);
				}
				logger.debug("*******************************奖品发放流程结束**********************************************");
			} catch (Exception e) {
				logger.error(e.getMessage());
				logger.error("奖品awardId==>>[" + awardId + "]发放失败");
			}
		}
	}

}
