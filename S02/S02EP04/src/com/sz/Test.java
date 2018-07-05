package com.sz;


import com.sz.Bar;

// 同包的含义是什么
/*
    是父子要求同包还是
    访问出和父类它同包
 */
public class Test {

    public static void main(String[] args) {

        Bar b = new Bar();
        System.out.println(b.age);
    }
}
