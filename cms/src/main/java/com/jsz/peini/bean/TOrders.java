package com.jsz.peini.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TOrders {
    private String orderscode;

    private String orderstype;

    private String tbdwcode;

    private String tbdwname;

    private String ggcode;

    private String ggname;

    private String dldwcode;

    private String dldwname;

    private String zbprocode;

    private String zbproname;

    private String zbdwcode;

    private String zbdwname;

    private String kfpdwname;

    private Date gbdate;

    private Date ordersdate;

    private String tblxr;

    private String deptname;

    private String zhiwu;

    private String phone;

    private String mobile;

    private String fax;

    private String email;

    private String address;

    private String qq;

    private String zipcode;

    private String tbrkhh;

    private String tbryhzh;

    private String fkfs;

    private BigDecimal orderssum;

    private BigDecimal fjje;

    private BigDecimal fkje;

    private String paymentno;

    private Integer paymentstatus;

    private BigDecimal paymentamount;

    private Date paymenttime;

    private String tkno;

    private Short tkstatus;

    private BigDecimal tkamount;

    private Date tktime;

    private String remarks;

    private String fileguid;

    private String auditstatus;

    private String auditcontent;

    private Date auditdate;

    private Short audituserid;

    private String auditusername;

    private Short ordernum;

    private Date addtime;

    private Short adduserid;

    private String addusername;

    private String adduserdeptid;

    private String adduserdeptname;

    private String adddwcode;

    private String adddwname;

    private String detail;

    private String shbj;

    private String scbj;

    private Date createdate;

    private Date modifydate;

    private Short mdiuserid;

    private String mdiusername;

    private String mdidwcode;

    private String mdidwname;

    private String by1;

    private String by2;

    private String by3;

    private String by4;

    private String by5;

    private Date dytime;

    private String dybj;

    private String dyr;

    private String kfpdz;

    private String kfpdh;

    private String kfpbz;

    private Date fptime;

    private String fpbj;

    private String fptype;

    private String mailgs;

    private String mailno;

    private Date sendtime;

    private String province;

    private String city;

    private String county;
    
    private List<TOrdersdetail> tOrdersdetaillList;

    public String getOrderscode() {
        return orderscode;
    }

    public void setOrderscode(String orderscode) {
        this.orderscode = orderscode;
    }

    public String getOrderstype() {
        return orderstype;
    }

    public void setOrderstype(String orderstype) {
        this.orderstype = orderstype;
    }

    public String getTbdwcode() {
        return tbdwcode;
    }

    public void setTbdwcode(String tbdwcode) {
        this.tbdwcode = tbdwcode;
    }

    public String getTbdwname() {
        return tbdwname;
    }

    public void setTbdwname(String tbdwname) {
        this.tbdwname = tbdwname;
    }

    public String getGgcode() {
        return ggcode;
    }

    public void setGgcode(String ggcode) {
        this.ggcode = ggcode;
    }

    public String getGgname() {
        return ggname;
    }

    public void setGgname(String ggname) {
        this.ggname = ggname;
    }

    public String getDldwcode() {
        return dldwcode;
    }

    public void setDldwcode(String dldwcode) {
        this.dldwcode = dldwcode;
    }

    public String getDldwname() {
        return dldwname;
    }

    public void setDldwname(String dldwname) {
        this.dldwname = dldwname;
    }

    public String getZbprocode() {
        return zbprocode;
    }

    public void setZbprocode(String zbprocode) {
        this.zbprocode = zbprocode;
    }

    public String getZbproname() {
        return zbproname;
    }

    public void setZbproname(String zbproname) {
        this.zbproname = zbproname;
    }

    public String getZbdwcode() {
        return zbdwcode;
    }

    public void setZbdwcode(String zbdwcode) {
        this.zbdwcode = zbdwcode;
    }

    public String getZbdwname() {
        return zbdwname;
    }

    public void setZbdwname(String zbdwname) {
        this.zbdwname = zbdwname;
    }

    public String getKfpdwname() {
        return kfpdwname;
    }

    public void setKfpdwname(String kfpdwname) {
        this.kfpdwname = kfpdwname;
    }

    public Date getGbdate() {
        return gbdate;
    }

    public void setGbdate(Date gbdate) {
        this.gbdate = gbdate;
    }

    public Date getOrdersdate() {
        return ordersdate;
    }

    public List<TOrdersdetail> gettOrdersdetaillList() {
		return tOrdersdetaillList;
	}

	public void settOrdersdetaillList(List<TOrdersdetail> tOrdersdetaillList) {
		this.tOrdersdetaillList = tOrdersdetaillList;
	}

	public void setOrdersdate(Date ordersdate) {
        this.ordersdate = ordersdate;
    }

    public String getTblxr() {
        return tblxr;
    }

    public void setTblxr(String tblxr) {
        this.tblxr = tblxr;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTbrkhh() {
        return tbrkhh;
    }

    public void setTbrkhh(String tbrkhh) {
        this.tbrkhh = tbrkhh;
    }

    public String getTbryhzh() {
        return tbryhzh;
    }

    public void setTbryhzh(String tbryhzh) {
        this.tbryhzh = tbryhzh;
    }

    public String getFkfs() {
        return fkfs;
    }

    public void setFkfs(String fkfs) {
        this.fkfs = fkfs;
    }

    public BigDecimal getOrderssum() {
        return orderssum;
    }

    public void setOrderssum(BigDecimal orderssum) {
        this.orderssum = orderssum;
    }

    public BigDecimal getFjje() {
        return fjje;
    }

    public void setFjje(BigDecimal fjje) {
        this.fjje = fjje;
    }

    public BigDecimal getFkje() {
        return fkje;
    }

    public void setFkje(BigDecimal fkje) {
        this.fkje = fkje;
    }

    public String getPaymentno() {
        return paymentno;
    }

    public void setPaymentno(String paymentno) {
        this.paymentno = paymentno;
    }


    public BigDecimal getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(BigDecimal paymentamount) {
        this.paymentamount = paymentamount;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public String getTkno() {
        return tkno;
    }

    public void setTkno(String tkno) {
        this.tkno = tkno;
    }

    public Short getTkstatus() {
        return tkstatus;
    }

    public void setTkstatus(Short tkstatus) {
        this.tkstatus = tkstatus;
    }

    public BigDecimal getTkamount() {
        return tkamount;
    }

    public void setTkamount(BigDecimal tkamount) {
        this.tkamount = tkamount;
    }

    public Date getTktime() {
        return tktime;
    }

    public void setTktime(Date tktime) {
        this.tktime = tktime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFileguid() {
        return fileguid;
    }

    public void setFileguid(String fileguid) {
        this.fileguid = fileguid;
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getAuditcontent() {
        return auditcontent;
    }

    public void setAuditcontent(String auditcontent) {
        this.auditcontent = auditcontent;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public Short getAudituserid() {
        return audituserid;
    }

    public void setAudituserid(Short audituserid) {
        this.audituserid = audituserid;
    }

    public String getAuditusername() {
        return auditusername;
    }

    public void setAuditusername(String auditusername) {
        this.auditusername = auditusername;
    }

    public Short getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    public Date getAddtime() {
        return addtime;
    }

    public Integer getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(Integer paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Short getAdduserid() {
        return adduserid;
    }

    public void setAdduserid(Short adduserid) {
        this.adduserid = adduserid;
    }

    public String getAddusername() {
        return addusername;
    }

    public void setAddusername(String addusername) {
        this.addusername = addusername;
    }

    public String getAdduserdeptid() {
        return adduserdeptid;
    }

    public void setAdduserdeptid(String adduserdeptid) {
        this.adduserdeptid = adduserdeptid;
    }

    public String getAdduserdeptname() {
        return adduserdeptname;
    }

    public void setAdduserdeptname(String adduserdeptname) {
        this.adduserdeptname = adduserdeptname;
    }

    public String getAdddwcode() {
        return adddwcode;
    }

    public void setAdddwcode(String adddwcode) {
        this.adddwcode = adddwcode;
    }

    public String getAdddwname() {
        return adddwname;
    }

    public void setAdddwname(String adddwname) {
        this.adddwname = adddwname;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getShbj() {
        return shbj;
    }

    public void setShbj(String shbj) {
        this.shbj = shbj;
    }

    public String getScbj() {
        return scbj;
    }

    public void setScbj(String scbj) {
        this.scbj = scbj;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Short getMdiuserid() {
        return mdiuserid;
    }

    public void setMdiuserid(Short mdiuserid) {
        this.mdiuserid = mdiuserid;
    }

    public String getMdiusername() {
        return mdiusername;
    }

    public void setMdiusername(String mdiusername) {
        this.mdiusername = mdiusername;
    }

    public String getMdidwcode() {
        return mdidwcode;
    }

    public void setMdidwcode(String mdidwcode) {
        this.mdidwcode = mdidwcode;
    }

    public String getMdidwname() {
        return mdidwname;
    }

    public void setMdidwname(String mdidwname) {
        this.mdidwname = mdidwname;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    public String getBy3() {
        return by3;
    }

    public void setBy3(String by3) {
        this.by3 = by3;
    }

    public String getBy4() {
        return by4;
    }

    public void setBy4(String by4) {
        this.by4 = by4;
    }

    public String getBy5() {
        return by5;
    }

    public void setBy5(String by5) {
        this.by5 = by5;
    }

    public Date getDytime() {
        return dytime;
    }

    public void setDytime(Date dytime) {
        this.dytime = dytime;
    }

    public String getDybj() {
        return dybj;
    }

    public void setDybj(String dybj) {
        this.dybj = dybj;
    }

    public String getDyr() {
        return dyr;
    }

    public void setDyr(String dyr) {
        this.dyr = dyr;
    }

    public String getKfpdz() {
        return kfpdz;
    }

    public void setKfpdz(String kfpdz) {
        this.kfpdz = kfpdz;
    }

    public String getKfpdh() {
        return kfpdh;
    }

    public void setKfpdh(String kfpdh) {
        this.kfpdh = kfpdh;
    }

    public String getKfpbz() {
        return kfpbz;
    }

    public void setKfpbz(String kfpbz) {
        this.kfpbz = kfpbz;
    }

    public Date getFptime() {
        return fptime;
    }

    public void setFptime(Date fptime) {
        this.fptime = fptime;
    }

    public String getFpbj() {
        return fpbj;
    }

    public void setFpbj(String fpbj) {
        this.fpbj = fpbj;
    }

    public String getFptype() {
        return fptype;
    }

    public void setFptype(String fptype) {
        this.fptype = fptype;
    }

    public String getMailgs() {
        return mailgs;
    }

    public void setMailgs(String mailgs) {
        this.mailgs = mailgs;
    }

    public String getMailno() {
        return mailno;
    }

    public void setMailno(String mailno) {
        this.mailno = mailno;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}