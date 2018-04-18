package com.jsz.peini.bean;

import java.math.BigDecimal;

public class TZbggBd {
    private Short id;

    private String ggcode;

    private String bdcode;

    private String bdname;
    
    private BigDecimal extzbwjsj;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getGgcode() {
        return ggcode;
    }

    public void setGgcode(String ggcode) {
        this.ggcode = ggcode;
    }

    public String getBdcode() {
        return bdcode;
    }

    public void setBdcode(String bdcode) {
        this.bdcode = bdcode;
    }

    public String getBdname() {
        return bdname;
    }

    public void setBdname(String bdname) {
        this.bdname = bdname;
    }

	public BigDecimal getExtzbwjsj() {
		return extzbwjsj;
	}

	public void setExtzbwjsj(BigDecimal extzbwjsj) {
		this.extzbwjsj = extzbwjsj;
	}
}