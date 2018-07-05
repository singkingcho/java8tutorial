package com.sz;

// 全部都是java.util包下面

import java.util.ArrayList;
import java.util.List;

public class MyList6 {


    public static void main(String[] args) {

        List list = new ArrayList();
        // 证明这个集合添加是有顺序的，List特点：有序 允许重复 元素连续，中间不允许有空的元素空间占用
        // 它的删除的效率非常低，代价很大。查询效率很高，来源于它有索引，索引可以直接定位的。
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for(int i = 0 ; i < list.size() ; i ++) {
            System.out.println(list.get(i));
        }

        // 在遍历的过程当中能够进行元素的修改，元素删除

        list.add(0,"我最帅");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for(int i = 0 ; i < list.size() ; i ++) {
            list.remove(i);
//            list.add(i,"我就是那么帅");
        }

//        list.remove(0);
//        System.out.println(list.get(0) + "0号");

        for(int i = 0 ; i < list.size() ; i ++) {
            System.out.println(list.get(i));
        }


    }


}
