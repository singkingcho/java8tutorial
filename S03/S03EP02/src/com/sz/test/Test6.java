package com.sz.test;

import java.util.ArrayList;
import java.util.List;

public class Test6 {


    public static void main(String[] args) {
      Integer i = new Integer(3);
      Integer j = new Integer("3");
      // 下面发生了什么？  拆箱
      // i.add(j);
//      System.out.println(i + j);

        // 为true的情况仅仅只有如下几个：布尔值的true 字符串的不分大小写的true
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("true");
        Boolean b4 = new Boolean("false");
        Boolean b5 = new Boolean("True");
        Boolean b6 = new Boolean("null");
        Boolean b7 = new Boolean("Null");
        Boolean b8 = new Boolean("asdfasd");
        Boolean b9 = new Boolean("");
        Boolean b10 = new Boolean("0");
        Boolean b11 = new Boolean("1");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);
        System.out.println(b10);
        System.out.println(b11);

        Character c = new Character('f');
//        System.out.println();

        Integer a1 = 3;
        int a2 = a1;














    }
}
