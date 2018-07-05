package com.sz.test;

import com.sz.enums.Week;

public class Test1 {


    public static void main(String[] args) {
        System.out.println(Week.Sun);
        Week w = Week.Fri;
        Week w2 = Week.Fri;
        System.out.println(w);
        String str = "Fri";
        System.out.println(w == w2);
        // 这么比是不行的
//        System.out.println(w == str);
        System.out.println(str.equals(w));
    }




}
