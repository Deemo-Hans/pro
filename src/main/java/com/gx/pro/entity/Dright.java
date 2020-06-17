package com.gx.pro.entity;

import java.io.Serializable;

public class Dright implements Serializable {
    private Integer rightid;

    private String rightname;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }

    public String getRightname() {
        return rightname;
    }

    public void setRightname(String rightname) {
        this.rightname = rightname == null ? null : rightname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}