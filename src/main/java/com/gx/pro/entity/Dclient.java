package com.gx.pro.entity;

import java.io.Serializable;

public class Dclient implements Serializable {
    private String username;

    private String cliname;

    private String contact;

    private String phone;

    private String address;

    private String taxid;

    private String funds;

    private String pic;

    private static final long serialVersionUID = 1L;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid == null ? null : taxid.trim();
    }

    public String getFunds() {
        return funds;
    }

    public void setFunds(String funds) {
        this.funds = funds == null ? null : funds.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}