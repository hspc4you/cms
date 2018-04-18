package com.jsz.peini.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsz.peini.bean.WxUserInfo;
import com.jsz.peini.mapper.WxUserInfoMapper;
import com.jsz.peini.util.common.StringUtil;
import com.jsz.peini.util.constant.RedisKey;

@Service
public class WxUserInfoService {

	private Logger logger = LogManager.getLogger(WxUserInfoService.class);
	@Autowired
	private WxUserInfoMapper wxUserInfoMapper;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Transactional
	public void newUser(String openId) {
		WxUserInfo wxUserInfo = wxUserInfoMapper.selectWxUserInfoByOpenId(openId);
		if (wxUserInfo==null) {
			wxUserInfo = new WxUserInfo();
			wxUserInfo.setId(StringUtil.getUUID());
			wxUserInfo.setOpenId(openId);
			wxUserInfoMapper.insertSelective(wxUserInfo);
			logger.info("openId===>"+openId+"是一个新用户");
			stringRedisTemplate.opsForHash().put(RedisKey.wx_openId_userId, openId, wxUserInfo.getId());
		}else {
			logger.info("openId===>"+openId+"已经注册过了");
		}
	}
	
}
