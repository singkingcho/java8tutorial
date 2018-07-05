package com.sz.model;

/**
 * 抽象类的目的就是为了让人继承的。
 * 基类（抽象类，所有人写的时候继承它即可）
 */
public abstract class Animal {
    // 抽象化一个类使用关键字abstract

    private String name;

    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    // 抽象方法  被abrarct修饰的方法
    // ; 结束意味着，没有方法体 {}叫做方法体，
    // 抽象类里面可以没有抽象方法，有抽象方法，可以不是抽象类吗？
//    一旦有抽象方法，必须将类修改为抽象类
    // 抽象类里面可以有实例方法（非抽象的）
    public abstract  void move();

    // 静态方法 大部分都是工具方法
    public static void showGas(){
        System.out.println("放点气。");
    }



    // static不能与abtract共存
//    public   static abstract void m1()







}














