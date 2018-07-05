package com.sz.model;

import java.util.Date;

/**
 * 订单类
 */
public class Orders {

    private  String oid;

    /**
     * 指向某个客户
     */
    private String cid;

    private double totalPrice;

    /**
     * 下单时间
     */
    private Date date;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", cid='" + cid + '\'' +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                '}';
    }
}
