package com.sz;

import org.apache.log4j.Logger;

public class LogDemo1 {


    // 声明一个日志对象，一个类一个就够了,
    private static final Logger LOGGER = Logger.getLogger("com.sz.LogDemo1");
    // Java将类本身都视为一个对象
//    private static final Logger LOGGER = Logger.getLogger(LogDemo1.class);

    public static void main(String[] args) {

//        int sum = add(66,225);
//        double num = devide(3,0);
//        System.out.println("num:" + num);
        int num = devide(3,0);
        System.out.println(num);

    }


    public static int add(int x,int y){
        LOGGER.info(x + "+" + y + "=" + (x+y));
        LOGGER.debug("bug一下");

        return x+y;
    }

    public static double devide(double a,double b){

        try{
            LOGGER.info(a + "÷"  + b +  "=" + a/b);
            return a/b;
        } catch (ArithmeticException e){
            LOGGER.error(a + "÷" + b + " 存在错误：" + e.getMessage());
            return 0;
        }
    }

    public static int devide(int a,int b){

        try{
            LOGGER.info(a + "÷"  + b +  "=" + a/b);
            return a/b;
        } catch (ArithmeticException e){
            LOGGER.error(a + "÷" + b + " 存在错误：" + e.getMessage());
            return 0;
        }
    }




}














