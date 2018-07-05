package com.sz.test;

import com.sz.Demo3;

public class TestDemo3 {

    public static void main(String[] args) {
        Demo3 d  = new Demo3();
        d.show(3);
        d.show(33.33);
        // 这一行不行
//        d.show(true);
    }
}
