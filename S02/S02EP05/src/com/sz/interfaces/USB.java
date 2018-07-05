package com.sz.interfaces;

/**
 * 创建接口的语法
 * public非必须，但是基本上都是用的public
 * public interface name{
 *
 * }
 *
 * USB是一种接口-接口（Java里面接口是一种约定，能力的描述）
 *
 */
public interface USB {

//    int age;
    // 在接口当中，由于它本身不能实例化，并且往往只是约定能力，所以在其中不允许有实例变量
      int age = 33;// 默认就是个常量（缺省类public static final）
    /**
     * 约定由插的能力
     * 写这个方法的时候，没有写访问修饰符
     * 没有加上abstract
     * 也没有方法体
     * 接口里面的方法默认是  public abstract所修饰（缺省）
     *
     */
     void insert();



    /**
     * 接口当中可以有静态方法的实现
     */
    static void haha(){
         System.out.println("hahahahaha");
     }
     static void hehe(){
        System.out.println("hahahahaha");
    }

}













