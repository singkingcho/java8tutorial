package com.sz.test;

import com.sz.interfaces.USB;
import com.sz.model.KeyBoard;
import com.sz.model.Mouse;

public class Test5 {


    public static void main(String[] args) {
        // 利用接口体现我们的多态
//        USB usb = new Mouse();
        USB usb = new Mouse();

        // 你能使用什么，取决于你声明的是什么，你具有的能力（潜在的能力是什么）取决于生你的人。
        // 向上转型  子类的实例赋值给了父类的引用（可以是普通的类，也可以是抽象类，也可以是接口）
        // 向下转型 类型转换
        // 向下转型的时候是有风险的，ClassCastException（类型转换异常）

        //我们要解决类型转换的问题
        // instanceof 这个判断的符号操作符
        // a instanceof B 含义就是 a是不是B类型的一个实例
        // instanceof 这个判断符号比较消耗性能
        if(usb instanceof KeyBoard ){
            System.out.println("真的键盘");
            ((KeyBoard)usb).drawing();
        } else if(usb instanceof  Mouse){
            System.out.println("真是是鼠标");
            ((Mouse)usb).click();
        }


        usb.insert();
//        usb.drawing();
        // 接口能实例化化？ 不能

        USB.haha();
//        USB.age = 44;
        System.out.println(USB.age);
    }
}
