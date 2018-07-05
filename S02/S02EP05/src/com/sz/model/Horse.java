package com.sz.model;

/**
 * 概念：
 * 顶层
 * 下层之间的关系
 * 人
 *  男人 女人
 *
 *
 *  是不是问题
 *    is a
 *    A is a B
 *    子类必然满足这个不安息
 *    子类 is a 父 类
 */
public class Horse extends  Animal {


    // 子类去实现抽象类中的抽象方法必须有方法体
    @Override
    public void move(){
        System.out.println("郭德纲郭德纲");
    }

}


































