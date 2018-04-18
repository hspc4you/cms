package com.jsz.peini.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsz.peini.bean.SmsLog;
import com.jsz.peini.mapper.SmsLogMapper;
import com.jsz.peini.util.constant.Constants;
import com.jsz.peini.util.sms.SmsSend;


@Service
public class SmsService {
	
	@Autowired
	private SmsLogMapper smsLogMapper;
	
	public int insertSms(SmsLog smsLog) {
		int result = smsLogMapper.insertSms(smsLog);
		return result;
	}
	
	public boolean sendMessage(String userName,String param,int smstype){
		boolean isSend = false;
		String resultCode = SmsSend.sendMessage(userName,param,smstype);
		if(resultCode.equals("000000")){
			isSend = true;
		}
		SmsLog smsLog = new SmsLog();
		smsLog.setType(smstype);
		smsLog.setContent(param);
		smsLog.setPhone(userName);
		smsLog.setSmsStatus(resultCode);
		smsLogMapper.insertSms(smsLog);
		return isSend;
	}
	public boolean sendPassword(String userName,String param,int smstype){
		boolean isSend = false;
		String resultCode = SmsSend.sendPassword(userName,param,smstype);
		if(resultCode.equals("000000")){
			isSend = true;
		}
		SmsLog smsLog = new SmsLog();
		smsLog.setType(smstype);
		smsLog.setContent(param);
		smsLog.setPhone(userName);
		smsLog.setSmsStatus(resultCode);
		smsLogMapper.insertSms(smsLog);
		return isSend;
	}

}
