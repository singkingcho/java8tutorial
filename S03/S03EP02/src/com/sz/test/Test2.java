package com.sz.test;

import com.sz.enums.Week;

public class Test2 {


    public static void main(String[] args) {


        // 枚举可以应用于switch结构
        Week w = Week.Fri;
        switch(w){
            case Mon:
                System.out.println("1");
            break ;
            case Tue:
                System.out.println("2");
            break ;
            case Thi:
                System.out.println("4");
            break ;
            case Fri:
                System.out.println("5");
            break ;
        }
    }
}
