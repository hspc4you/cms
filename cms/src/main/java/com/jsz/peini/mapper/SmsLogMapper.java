package com.jsz.peini.mapper;

import com.jsz.peini.bean.SmsLog;

public interface SmsLogMapper {
	//短信日志插入
    int insertSms(SmsLog smsLog);

}