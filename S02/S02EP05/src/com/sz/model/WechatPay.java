package com.sz.model;

public class WechatPay extends  Pay {
    @Override
    public void pay() {
        System.out.println("微信支付，3毛");
    }
}
