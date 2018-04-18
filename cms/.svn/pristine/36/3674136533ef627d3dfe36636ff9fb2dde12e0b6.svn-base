package com.jsz.peini.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jsz.peini.bean.GoldHistory;
import com.jsz.peini.bean.OrderInfo;
import com.jsz.peini.bean.UserSms;
import com.jsz.peini.bean.UserAccount;
import com.jsz.peini.bean.UserInfo;

import com.jsz.peini.mapper.GoldHistoryMapper;
import com.jsz.peini.mapper.OrderInfoMapper;
import com.jsz.peini.mapper.UserSmsMapper;
import com.jsz.peini.mapper.UserAccountMapper;
import com.jsz.peini.mapper.UserInfoMapper;

import com.jsz.peini.util.common.StringUtil;

@Service

public class GoldService {
	@Resource
	private GoldHistoryMapper goldHistoryMapper;

	@Resource
	private UserAccountMapper userAccountMapper;

	@Resource
	private UserInfoMapper userInfoMapper;
	@Autowired
	private UserSmsMapper userSmsMapper;
	
	/**创建日志**/
	private Logger log = LogManager.getLogger(GoldService.class);

	@Resource
	private OrderInfoMapper orderInfoMapper;
	/**
	 * @描述:<导入金豆时的服务层>
	 * @日期:2017年7月26日
	 * @作者:hesipeng
	 * @param goldCustomerVoList
	 * @return 
	 */
	@Transactional
	public boolean importGold(UserInfo userInfo,BigDecimal money) {
		
		try {
					//返回包含userId和userPhone的初始化订单
					OrderInfo orderInfo = new OrderInfo();
					orderInfo.setUserId(userInfo.getId());
					orderInfo.setUserPhone(userInfo.getUserPhone());
					orderInfo.setOrderType(9);
					orderInfo.setOrderStatus(0);
					orderInfo.setAllMoney(money.multiply(new BigDecimal("100")).intValue());
					orderInfo.setPayMoney(0);
					orderInfo.setOrderTime(new Date());
					orderInfo.setCreateTime(new Date());
					orderInfo.setDiscount("10");
					orderInfo.setOrderCode("9"+new SimpleDateFormat("yyMMddHHmmssSSS").format(new Date())+"8"+(int)((Math.random()+1)*1000));
					orderInfoMapper.insert(orderInfo);//将订单提交
					//生成金豆流水信息
					GoldHistory goldHistory = new GoldHistory();
					goldHistory.setHisId(StringUtil.getUUID());
					goldHistory.setUserId(orderInfo.getUserId());
					goldHistory.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
					goldHistory.setOpType(1);
					goldHistory.setIsFinish(1);
					goldHistory.setValNum(money.multiply(new BigDecimal("100")).longValue());
					goldHistory.setHisType(12);
					goldHistory.setParamId(orderInfo.getId().toString());
					goldHistory.setIsDel(1);
					//提交金豆流水信息
					goldHistoryMapper.insert(goldHistory);
					UserAccount userAccount = new UserAccount();
					userAccount.setUserId(orderInfo.getUserId());
					userAccount.setGold(money.multiply(new BigDecimal("100")).intValue());
					userAccount.setRechangegold(money);
					userAccount.setGoldMonth(money);
					userAccount.setLastUpdate(new Date());
					userAccountMapper.updateOldCustGoldByUserId(userAccount);//修改该用户金豆账户
					UserSms userSms = new UserSms();
					userSms.setSmsid(StringUtil.getUUID());
					userSms.setIsremind(1);
					userSms.setReceivdel(0);
					userSms.setSenddel(0);
					userSms.setParamid(orderInfo.getId().toString());
					userSms.setSendtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
					userSms.setSmscontent("恭喜！系统赠送了您"+money.toPlainString()+"金豆，快去我的财富查看吧~点击可查看");
					userSms.setSmstype(111);
					userSms.setToid(orderInfo.getUserId());
					userSmsMapper.insertSelective(userSms);//系统消息入库
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new RuntimeException();
		}
		return true;
	}
	
		
	
}
