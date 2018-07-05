package com.sz.test;

import com.sz.biz.PayBiz;
import com.sz.model.AliPay;
import com.sz.model.Pay;
import com.sz.model.WechatPay;

public class Test4 {

    public static void main(String[] args) {
        Pay pay = new WechatPay();
        pay.setName("微信支付");
        PayBiz payBiz = new PayBiz();
        payBiz.setPay(pay);
        System.out.println(payBiz.getPay().getName());
    }
}
