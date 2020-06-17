package com.gx.pro.entity;

import java.io.Serializable;
import java.util.Date;

public class Dproj implements Serializable {
    private String projid;

    private String projname;

    private String projusername;

    private Date projdata;

    private String publicsher;

    private String description;

    private String pic;

    private Integer roleid;

    private static final long serialVersionUID = 1L;

    public String getProjid() {
        return projid;
    }

    public void setProjid(String projid) {
        this.projid = projid == null ? null : projid.trim();
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname == null ? null : projname.trim();
    }

    public String getProjusername() {
        return projusername;
    }

    public void setProjusername(String projusername) {
        this.projusername = projusername == null ? null : projusername.trim();
    }

    public Date getProjdata() {
        return projdata;
    }

    public void setProjdata(Date projdata) {
        this.projdata = projdata;
    }

    public String getPublicsher() {
        return publicsher;
    }

    public void setPublicsher(String publicsher) {
        this.publicsher = publicsher == null ? null : publicsher.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}