package com.gx.pro.entity;

import java.io.Serializable;
import java.util.Date;

public class Dbidding implements Serializable {
    private Integer bidid;

    private Integer projid;

    private Date biddata;

    private String username;

    private String cliname;

    private Double bidprice;

    private static final long serialVersionUID = 1L;

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public Integer getProjid() {
        return projid;
    }

    public void setProjid(Integer projid) {
        this.projid = projid;
    }

    public Date getBiddata() {
        return biddata;
    }

    public void setBiddata(Date biddata) {
        this.biddata = biddata;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname == null ? null : cliname.trim();
    }

    public Double getBidprice() {
        return bidprice;
    }

    public void setBidprice(Double bidprice) {
        this.bidprice = bidprice;
    }
}