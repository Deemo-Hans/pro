package com.gx.pro.entity;

import java.io.Serializable;

public class Duserrole implements Serializable {
    private Integer urid;

    private String username;

    private Integer roleid;

    private static final long serialVersionUID = 1L;

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}