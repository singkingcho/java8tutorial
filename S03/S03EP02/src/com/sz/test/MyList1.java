package com.sz.test;

import java.util.ArrayList;
import java.util.List;

public class MyList1 {

    public static void main(String[] args) {
//        List<String> l = new ArrayList<>();
//        List l = new ArrayList<String>();
        // 当加上泛型的限制之后就在集合当中元素的数据类型只能为String
        List<String> l = new ArrayList<String>();
        l.add("我是谁");

        String str = l.get(0);
        // 泛型的目的 1 提高程序的灵活性  2 提高安全性
//        l.add(3);
        List l2 = new ArrayList();
        l2.add(3);
        l2.add("哈哈");
//        String o = l2.get(0);



    }
}
