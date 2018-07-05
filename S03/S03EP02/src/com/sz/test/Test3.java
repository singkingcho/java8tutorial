package com.sz.test;

import com.sz.enums.Week;

public class Test3 {


    public static void main(String[] args) {
         Week w = Week.Fri;
         w.study();
         // values方法 得到一个数组
        Week[] values = Week.values();
        for(Week ww : values){
            System.out.println(ww);
        }

        System.out.println(">>>>>>>>>>>>>");
        // valueOf接收一个String作为参数
        System.out.println(Week.valueOf("Sun"));


    }
}
