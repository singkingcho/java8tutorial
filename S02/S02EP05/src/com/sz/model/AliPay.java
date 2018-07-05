package com.sz.model;

public class AliPay extends  Pay {

    @Override
    public void pay() {
        System.out.println("支付宝支付两块钱");
    }
}
