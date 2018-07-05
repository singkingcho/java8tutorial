package com.sz.biz;

import com.sz.model.Pay;

/**
 * 支付业务类
 */
public class PayBiz {

    private Pay pay;

    public void pay(Pay pay){
        pay.pay();
    }


    public Pay getPay(){
        return pay;
    }


    public void setPay(Pay pay){
        this.pay = pay;
    }
}
