package com.sz.test;

import com.sz.biz.PayBiz;
import com.sz.model.Pay;
import com.sz.model.WechatPay;

public class Test3 {

    public static void main(String[] args) {
        PayBiz payBiz = new PayBiz();
        // 改 的地方降到最小
        Pay pay = new WechatPay();
//        Pay pay2 = new WechatPay();
        payBiz.pay(pay);

    }



}











