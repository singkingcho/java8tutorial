package com.sz.biz;

import com.sz.model.Saler;

/**
 * 饿了马为客户提供服务的一个接口
 */
public interface HungryHorseBiz {

    /**
     * 1 欢迎方法
     */

    void welcome();


    /**
     * 2 商家所有查询
     */
    Saler[] selectAllSalers();


    /**
     * 3 根据商家查出对应的商品
     */


}
