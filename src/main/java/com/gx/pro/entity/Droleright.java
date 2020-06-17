package com.gx.pro.entity;

import java.io.Serializable;

public class Droleright implements Serializable {
    private Integer rrid;

    private Integer roleid;

    private Integer rightid;

    private static final long serialVersionUID = 1L;

    public Integer getRrid() {
        return rrid;
    }

    public void setRrid(Integer rrid) {
        this.rrid = rrid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }
}