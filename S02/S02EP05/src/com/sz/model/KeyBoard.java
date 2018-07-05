package com.sz.model;

import com.sz.interfaces.USB;

/**
 * implements 实现意思，实现接口，实现者有这种能力
 * ，实现接口之后，两个选择：
 *
 */
public class KeyBoard implements USB {


    @Override
    public void insert() {
        System.out.println("横着插");
    }

    public void drawing(){
        System.out.println("斜着拔");
    }
}
