package com.sz;

// 全部都是java.util包下面
import com.sz.mode.User;

import java.util.ArrayList;
import java.util.List;

public class MyList4 {


    public static void main(String[] args) {

        List list = new ArrayList();
        // 证明这个集合添加是有顺序的，List特点：有序 允许重复
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.isEmpty());

    }


}
