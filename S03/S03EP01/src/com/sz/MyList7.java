package com.sz;

// 全部都是java.util包下面

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList7 {


    public static void main(String[] args) {

        List list = new ArrayList();
        // 证明这个集合添加是有顺序的，List特点：有序 允许重复 元素连续，中间不允许有空的元素空间占用
        // 它的删除的效率非常低，代价很大。查询效率很高，来源于它有索引，索引可以直接定位的。
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator it = list.iterator();
        // 如果还有下一个元素，那么返回true
        // 必须掌握，使用集合的时候经常都会使用迭代器。
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }





    }


}
