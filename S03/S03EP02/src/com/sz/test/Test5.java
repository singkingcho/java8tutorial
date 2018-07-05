package com.sz.test;

import java.util.ArrayList;
import java.util.List;

public class Test5 {


    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        System.out.println(l.get(0));

        int i = 3;
        Integer j = new Integer(3);
        // 通过包装类Wrapper
        int k = j.intValue();

        // 可以的原因来自于自动的装箱auto boxing
        Integer m = 3;// new Integer(3);
        // 自动拆箱
        int n = m;
        int q = m.intValue();
        // 引用数据类型赋值给基本数据类型的过程就称之为拆箱
        // 将基本数据类型赋值给引用数据类型的过程称之为装箱

















    }
}
