package com.sz.model;

/**
 * 我也没有指代具体的某种哺乳动物
 * 一个类去继承类一个抽象类之后，如果父类里面有抽象方法
 * 对于子类而言可以有两种处理方式：
 *          1 实现所有的抽象方法。
 *          2 将自身抽象化也可以
 */
public abstract class Mammal extends  Animal {

    public static int age = 18;




    /**
     * 胎生方法
     * 我们去写抽象方法的时候，很少会使用默认的访问修饰符
     * 一般都是
     * public
     * protected
     */
    protected abstract  void viviparous();


}


















