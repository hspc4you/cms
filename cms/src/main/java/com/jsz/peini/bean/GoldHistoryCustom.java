package com.jsz.peini.bean;

import java.math.BigDecimal;

public class GoldHistoryCustom extends GoldHistory {
	
	//订单号
	private String orderCode;
	//用户ID
	private String accCode;
	//手机
	private String userPhone;
	//折扣
	private BigDecimal discount;
	//赠送数量
	private BigDecimal gift;
	//支付平台 2:微信 3:支付宝
	private Integer payType;
	//实收金额
	private BigDecimal payMoney;
	//总客户
	private String totalCustCount;
	//查询订单量
	private String orderCount;
	//总充值量
	private String rechargeSum;
	//总实收金额
	private String payMoneySum;
	//总补贴金额
	private String assumeSum;
	//开始时间
	private String startTime;
	//结束时间
	private String endTime;
	//省
	private String provinceName;
	//市
	private String cityName;
	//平台补贴
	private BigDecimal officialAssume;
	//店铺名称
	private String sellerName;
	//店铺名称
	private String othernickname;
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getGift() {
		return gift;
	}
	public void setGift(BigDecimal gift) {
		this.gift = gift;
	}
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}
	public String getRechargeSum() {
		return rechargeSum;
	}
	public void setRechargeSum(String rechargeSum) {
		this.rechargeSum = rechargeSum;
	}
	public String getPayMoneySum() {
		return payMoneySum;
	}
	public void setPayMoneySum(String payMoneySum) {
		this.payMoneySum = payMoneySum;
	}
	public String getTotalCustCount() {
		return totalCustCount;
	}
	public void setTotalCustCount(String totalCustCount) {
		this.totalCustCount = totalCustCount;
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
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public BigDecimal getOfficialAssume() {
		return officialAssume;
	}
	public void setOfficialAssume(BigDecimal officialAssume) {
		this.officialAssume = officialAssume;
	}
	public String getAssumeSum() {
		return assumeSum;
	}
	public void setAssumeSum(String assumeSum) {
		this.assumeSum = assumeSum;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getOthernickname() {
		return othernickname;
	}
	public void setOthernickname(String othernickname) {
		this.othernickname = othernickname;
	}
	
	
}
