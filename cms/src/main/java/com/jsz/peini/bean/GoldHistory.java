package com.jsz.peini.bean;

import java.math.BigDecimal;

public class GoldHistory {
    private String hisId;

    private String userId;

    private String createTime;

    private Integer opType;

    private Integer isFinish;

    private Long valNum;
    
    private Long valNumtop;

    private Integer hisType;

    private String paramId;

    private Integer isDel;

    private String otherid;
    
    private Integer type;
    
    private Integer errorRow;
    
    private BigDecimal currentGold;
    private BigDecimal currentRechargeTotal;
    private BigDecimal currentPayTotal;
    private BigDecimal currentGiveTotal;
    
    
    
    //昵称
    private String nickname;
    private Integer sex;//性别 1男2女

    //年龄
    private Integer age;
    //所在地省
    private Integer nowProvince;
    //所在市
    private Integer nowCity;
    //手机号
    private String phone;
    
    private Integer pageNum;
    private Integer pageSize;
    //身份证号
    private String idCardNo;
    //身份证姓名
    private String realName;

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Integer getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Integer isFinish) {
        this.isFinish = isFinish;
    }

    public Long getValNum() {
        return valNum;
    }

    public void setValNum(Long valNum) {
        this.valNum = valNum;
    }

    public Integer getHisType() {
        return hisType;
    }

    public void setHisType(Integer hisType) {
        this.hisType = hisType;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getOtherid() {
        return otherid;
    }

    public void setOtherid(String otherid) {
        this.otherid = otherid;
    }

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getErrorRow() {
		return errorRow;
	}

	public void setErrorRow(Integer errorRow) {
		this.errorRow = errorRow;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Long getValNumtop() {
		return valNumtop;
	}

	public void setValNumtop(Long valNumtop) {
		this.valNumtop = valNumtop;
	}

	public BigDecimal getCurrentGold() {
		return currentGold;
	}

	public void setCurrentGold(BigDecimal currentGold) {
		this.currentGold = currentGold;
	}

	public BigDecimal getCurrentRechargeTotal() {
		return currentRechargeTotal;
	}

	public void setCurrentRechargeTotal(BigDecimal currentRechargeTotal) {
		this.currentRechargeTotal = currentRechargeTotal;
	}

	public BigDecimal getCurrentPayTotal() {
		return currentPayTotal;
	}

	public void setCurrentPayTotal(BigDecimal currentPayTotal) {
		this.currentPayTotal = currentPayTotal;
	}

	public BigDecimal getCurrentGiveTotal() {
		return currentGiveTotal;
	}

	public void setCurrentGiveTotal(BigDecimal currentGiveTotal) {
		this.currentGiveTotal = currentGiveTotal;
	}
}