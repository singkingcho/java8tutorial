package com.sz.model;

/**
 * 商品类
 */
public class Item {

    private String iid;

    private String name;

    /**
     * 1 代表斤
     * 2 代表个
     * 。。。。
     */
    private String unit;

    private double price;

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name +",单价" + price + unit;
    }
}
