package com.jsz.peini.bean;

import java.math.BigDecimal;

public class TOrdersdetail {
    private Long id;

    private String orderscode;

    private String fycode;

    private String fyname;

    private String fytype;

    private BigDecimal fyje;

    private String remarks;


    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderscode() {
        return orderscode;
    }

    public void setOrderscode(String orderscode) {
        this.orderscode = orderscode;
    }

    public String getFycode() {
        return fycode;
    }

    public void setFycode(String fycode) {
        this.fycode = fycode;
    }

    public String getFyname() {
        return fyname;
    }

    public void setFyname(String fyname) {
        this.fyname = fyname;
    }

    public String getFytype() {
        return fytype;
    }

    public void setFytype(String fytype) {
        this.fytype = fytype;
    }

    public BigDecimal getFyje() {
        return fyje;
    }

    public void setFyje(BigDecimal fyje) {
        this.fyje = fyje;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}