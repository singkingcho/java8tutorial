package com.sz;

// 全部都是java.util包下面

import java.util.ArrayList;
import java.util.List;

public class MyList5 {


    public static void main(String[] args) {

        List list = new ArrayList();
        // 证明这个集合添加是有顺序的，List特点：有序 允许重复
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // 对于JDK5 添加了一个增强型的for循环
        for(Object obj:list){
            System.out.println(obj);

        }


    }


}
