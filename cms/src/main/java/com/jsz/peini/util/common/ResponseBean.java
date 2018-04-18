package com.jsz.peini.util.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsz.peini.bean.User;

public class ResponseBean<T> {
	
	private Boolean respStatus;
	
	private String respDesc;
	
	private T respObj;
	
	private List<T> respList;

	public Boolean getRespStatus() {
		return respStatus;
	}

	public void setRespStatus(Boolean respStatus) {
		this.respStatus = respStatus;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	public T getRespObj() {
		return respObj;
	}

	public void setRespObj(T respObj) {
		this.respObj = respObj;
	}

	public List<T> getRespList() {
		return respList;
	}

	public void setRespList(List<T> respList) {
		this.respList = respList;
	}

}
