package com.shx.law.mongo.entity;

import java.util.Date;

import org.bson.types.ObjectId;

public class AuthCode {
    private ObjectId _id;
    private String phone;
    private String authCode;

    private Date createDate;

    public String getPhone() {
        return phone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Override
    public String toString() {
        return "AuthCode [phone=" + phone + ", authCode=" + authCode + ", createDate=" + createDate + "]";
    }
}
