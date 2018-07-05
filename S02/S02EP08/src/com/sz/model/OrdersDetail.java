package com.sz.model;

/**
 * 订单详情类
 */
public class OrdersDetail {

    /**
     * 指向订单ID
     */
    private String oid;


    private ItemBuyDetail[] itemBuyDetails;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public ItemBuyDetail[] getItemBuyDetails() {
        return itemBuyDetails;
    }

    public void setItemBuyDetails(ItemBuyDetail[] itemBuyDetails) {
        this.itemBuyDetails = itemBuyDetails;
    }
}
