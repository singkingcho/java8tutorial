package com.sz.test;

import com.sz.model.Animal;
import com.sz.model.Horse;
import com.sz.model.Pig;

public class Test2 {

    public static void main(String[] args) {

        // 没有报错，这里就是我们多态的一种体现
        // 使用父类的引用指向子类的实例
        /*
            多态基础：
                1 有继承关系
                2 方法的重写
                3 必须通过父类的引用指向子类的实例
         */

        Animal animal = new Horse();
        animal.setName("萌萌");
        // 去除多余的包（） Ctrl + alt + o
        System.out.println(animal.getName());
        // 用父类声明的一个引用，在方法执行的时候却执行了子类的方法，这就是一种多态的体现
        animal.move();
        Animal animal2 = new Pig();
        animal2.move();




    }
}
















