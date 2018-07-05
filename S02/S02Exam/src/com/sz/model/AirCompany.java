package com.sz.model;

/**
 * 航空公司类
 */
public class AirCompany {


    private String aid;

    private String name;

    public AirCompany() {
    }

    public AirCompany(String aid, String name) {
        this.aid = aid;
        this.name = name;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AirCompany{" +
                "aid='" + aid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
