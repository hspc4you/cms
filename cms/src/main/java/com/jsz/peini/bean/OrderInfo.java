package com.jsz.peini.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String userId;

    private Integer sellerInfoId;
    
    private String otherId;
    //订单状态
    private Integer orderStatus;
    //订单总价
    private Integer allMoney;
    //不参与折扣金额
    private BigDecimal exclusiveMoney;
    //订单实际支付价格
    private Integer payMoney;
    //优惠券金额
    private Integer couponMoney;
    
    private Integer couponId;
    //用户手机号
    private String userPhone;
    //店铺联系方式
    private String contractPhone;
    //提交订单时间
    private Date orderTime;
    
    private Integer taskInfoId;
    //打折信息描述
    private String orderDesc;
    //商家应得
    private BigDecimal sellerIncome;
    //官方补贴
    private BigDecimal officialAssume;
    //店铺补贴
    private BigDecimal sellerAssume;
    //补贴类型
    private Integer assumeType;
    //自定义变量
    public String accCode;
    
    public String nickname;
    
    public String imageHead;
    //买单方式  1.我买单 2.他买单 3.AA制
    public Integer otherBuy;
    //对方昵称
    public String otherNickname;
    //对方头像
    public String otherImageHead;
    
    private Integer pageNum;
    
    private Integer pageSize;
    //开始时间
    private String startTime;
    //结束时间
    private String endTime;
    //店铺姓名
    private String sellerName;
    //优惠券名称
    private String couponName;
    //用于收银核实
    private Integer sellerStatus;
    //支付方式
    private Integer payType;
    //消费方式，1任务3到店消费
    private Integer orderType;
    //模糊查询订单号
    private String orderCode;
    //商家分类
    private String sellerType;
    //商户id
    private Integer companyId;
    //用于模糊查询
    private String likeName;
    //支付时间
    private String payTime;
    //自定义商户id
    private Integer orderSellerId;
    //省
    private Integer codesProvince;
    //市
   
    private Integer cityCode;
    //是否老客户
    private Integer isOld;
    //商家小类别
    private Integer labelsId;
    //自定义用于下载
    private Integer downloadNum;
    
    
    private Date createTime;
    
    
    private String discount;
    
    private String paramId;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Integer allMoney) {
        this.allMoney = allMoney;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(Integer couponMoney) {
        this.couponMoney = couponMoney;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getIsOld() {
		return isOld;
	}

	public void setIsOld(Integer isOld) {
		this.isOld = isOld;
	}

	public String getImageHead() {
		return imageHead;
	}

	public void setImageHead(String imageHead) {
		this.imageHead = imageHead;
	}


	public String getOtherNickname() {
		return otherNickname;
	}

	public void setOtherNickname(String otherNickname) {
		this.otherNickname = otherNickname;
	}

	public String getOtherImageHead() {
		return otherImageHead;
	}

	public void setOtherImageHead(String otherImageHead) {
		this.otherImageHead = otherImageHead;
	}

	public Integer getSellerInfoId() {
		return sellerInfoId;
	}

	public void setSellerInfoId(Integer sellerInfoId) {
		this.sellerInfoId = sellerInfoId;
	}

	public Integer getOtherBuy() {
		return otherBuy;
	}

	public void setOtherBuy(Integer otherBuy) {
		this.otherBuy = otherBuy;
	}

	public Integer getTaskInfoId() {
		return taskInfoId;
	}

	public void setTaskInfoId(Integer taskInfoId) {
		this.taskInfoId = taskInfoId;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

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

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getSellerStatus() {
		return sellerStatus;
	}

	public void setSellerStatus(Integer sellerStatus) {
		this.sellerStatus = sellerStatus;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getSellerType() {
		return sellerType;
	}

	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getLikeName() {
		return likeName;
	}

	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Integer getOrderSellerId() {
		return orderSellerId;
	}

	public void setOrderSellerId(Integer orderSellerId) {
		this.orderSellerId = orderSellerId;
	}

	public Integer getCodesProvince() {
		return codesProvince;
	}

	public void setCodesProvince(Integer codesProvince) {
		this.codesProvince = codesProvince;
	}

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public Integer getLabelsId() {
		return labelsId;
	}

	public void setLabelsId(Integer labelsId) {
		this.labelsId = labelsId;
	}

	public Integer getDownloadNum() {
		return downloadNum;
	}

	public void setDownloadNum(Integer downloadNum) {
		this.downloadNum = downloadNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getParamId() {
		return paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	public String getAccCode() {
		return accCode;
	}

	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}

	

	public BigDecimal getOfficialAssume() {
		return officialAssume;
	}

	public void setOfficialAssume(BigDecimal officialAssume) {
		this.officialAssume = officialAssume;
	}

	public BigDecimal getSellerAssume() {
		return sellerAssume;
	}

	public void setSellerAssume(BigDecimal sellerAssume) {
		this.sellerAssume = sellerAssume;
	}

	public BigDecimal getSellerIncome() {
		return sellerIncome;
	}

	public void setSellerIncome(BigDecimal sellerIncome) {
		this.sellerIncome = sellerIncome;
	}

	public Integer getAssumeType() {
		return assumeType;
	}

	public void setAssumeType(Integer assumeType) {
		this.assumeType = assumeType;
	}

	public BigDecimal getExclusiveMoney() {
		return exclusiveMoney;
	}

	public void setExclusiveMoney(BigDecimal exclusiveMoney) {
		this.exclusiveMoney = exclusiveMoney;
	}
}