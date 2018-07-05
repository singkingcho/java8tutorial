package com.sz.enums;

import com.sz.Show;

public enum Week  implements Show {
    // 这个就是简单的将可以使用的这些元素的字面值直接列举即可
    // 列举的所有的字面值都是静态的常量
    // 如果枚举除了当中的静态常量之外还有其它成员的话，必须以分号结束。
    Mon,Tue,Wed,Thi,Fri,Sat,Sun;


    // 枚举当中的构造器必须私有化  构造器的执行次数等同于枚举当中可用元素的个数
    Week(){
        System.out.println("Week no args constructor....");
    }

    public void study(){
        System.out.println("学习使我快乐。");
    }

    @Override
    public void noShow() {
        System.out.println("欢乐的时光总是短暂的。");
    }
}
