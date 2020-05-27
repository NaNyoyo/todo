package com.yoyo.pattern.chain;

import java.util.Date;

public class Mer {
    private  String name;//商户名
    private String industry;//行业
    private Date registDate;//注册日期
    private String address;//地址

    public Mer(String name, String industry, Date registDate, String address) {
        this.name = name;
        this.industry = industry;
        this.registDate = registDate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
