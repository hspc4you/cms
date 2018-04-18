package com.jsz.peini.util.common;

import java.io.Serializable;
import java.util.Date;

public class SmsVo implements Serializable{

	private String yzm;
	
	private Date sendTime;
	
	public SmsVo(String yzm, Date sendTime) {
		super();
		this.yzm = yzm;
		this.sendTime = sendTime;
	}

	public String getYzm() {
		return yzm;
	}

	public void setYzm(String yzm) {
		this.yzm = yzm;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
