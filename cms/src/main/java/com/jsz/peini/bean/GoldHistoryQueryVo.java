package com.jsz.peini.bean;

import java.math.BigDecimal;

public class GoldHistoryQueryVo {
			//第几页
			private Integer pageNum;
			//每页多少条
			private Integer pageSize;
			//开始时间
			private String startTime;
			//结束时间
			private String endTime;
			//0:全部 ;1:充值数量 2:平台补贴 3:实收金额 4:补贴折扣
			private Integer queryType;
			//起始数值
			private BigDecimal startNum;
			//结束数值
			private BigDecimal endNum;
			//支付平台 2:微信 3:支付宝
			private Integer payType;
			//金豆充值类型
			private Integer hisType;
			///用户名/用户ID/手机
			private String queryText;
			//订单号
			private String orderCode;
			//排序标识
			private Integer orderFlag;
			//操作类型
			private Integer optionType;
			//目标名称 
			private String objName;
			
			 private Integer nowProvince;
			 
			 private Integer nowCity;
			 
			 private Integer type;
			
			
			public Integer getPageNum() {
				return pageNum;
			}
			public void setPageNum(Integer pageNum) {
				this.pageNum = pageNum;
			}
			public Integer getPageSize() {
				return pageSize;
			}
			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}
			public String getStartTime() {
				return startTime;
			}
			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
			public String getEndTime() {
				return endTime;
			}
			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
			public Integer getQueryType() {
				return queryType;
			}
			public void setQueryType(Integer queryType) {
				this.queryType = queryType;
			}
			
			public Integer getPayType() {
				return payType;
			}
			public void setPayType(Integer payType) {
				this.payType = payType;
			}
			public String getQueryText() {
				return queryText;
			}
			public void setQueryText(String queryText) {
				this.queryText = queryText;
			}
			public Integer getNowProvince() {
				return nowProvince;
			}
			public void setNowProvince(Integer nowProvince) {
				this.nowProvince = nowProvince;
			}
			public Integer getNowCity() {
				return nowCity;
			}
			public void setNowCity(Integer nowCity) {
				this.nowCity = nowCity;
			}
			public Integer getType() {
				return type;
			}
			public void setType(Integer type) {
				this.type = type;
			}
			public Integer getHisType() {
				return hisType;
			}
			public void setHisType(Integer hisType) {
				this.hisType = hisType;
			}
			public String getOrderCode() {
				return orderCode;
			}
			public void setOrderCode(String orderCode) {
				this.orderCode = orderCode;
			}
			public Integer getOrderFlag() {
				return orderFlag;
			}
			public void setOrderFlag(Integer orderFlag) {
				this.orderFlag = orderFlag;
			}
			public BigDecimal getStartNum() {
				return startNum;
			}
			public void setStartNum(BigDecimal startNum) {
				this.startNum = startNum;
			}
			public BigDecimal getEndNum() {
				return endNum;
			}
			public void setEndNum(BigDecimal endNum) {
				this.endNum = endNum;
			}
			public Integer getOptionType() {
				return optionType;
			}
			public void setOptionType(Integer optionType) {
				this.optionType = optionType;
			}
			public String getObjName() {
				return objName;
			}
			public void setObjName(String objName) {
				this.objName = objName;
			}
}			
