package com.sz.model;

/**
 * 商品购买的详情
 */
public class ItemBuyDetail {


    private Item item;

    private double num;

    private double totalPrice;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = item.getPrice()*num;
    }
}
