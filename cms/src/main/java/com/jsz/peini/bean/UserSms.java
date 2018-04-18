package com.jsz.peini.bean;

public class UserSms {
    private String smsid;

    private String fromid;

    private String toid;

    private String paramid;

    private String sendtime;

    private Integer isremind;

    private Integer senddel;

    private Integer receivdel;

    private Integer smstype;

    private String smscontent;
    
    public UserSms(){
    	
    }
    
    public UserSms(String fromid, String toid, String paramid,
			Integer smstype, String smscontent) {
		super();
		this.fromid = fromid;
		this.toid = toid;
		this.paramid = paramid;
		this.smstype = smstype;
		this.smscontent = smscontent;
	}

    public String getSmsid() {
        return smsid;
    }

    public void setSmsid(String smsid) {
        this.smsid = smsid;
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid;
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public String getParamid() {
        return paramid;
    }

    public void setParamid(String paramid) {
        this.paramid = paramid;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getIsremind() {
        return isremind;
    }

    public void setIsremind(Integer isremind) {
        this.isremind = isremind;
    }

    public Integer getSenddel() {
        return senddel;
    }

    public void setSenddel(Integer senddel) {
        this.senddel = senddel;
    }

    public Integer getReceivdel() {
        return receivdel;
    }

    public void setReceivdel(Integer receivdel) {
        this.receivdel = receivdel;
    }

    public Integer getSmstype() {
        return smstype;
    }

    public void setSmstype(Integer smstype) {
        this.smstype = smstype;
    }

    public String getSmscontent() {
        return smscontent;
    }

    public void setSmscontent(String smscontent) {
        this.smscontent = smscontent;
    }
}