package com.sz;

// 全部都是java.util包下面
import com.sz.mode.User;

import java.util.ArrayList;
import java.util.List;

public class MyList {


    public static void main(String[] args) {
        // List作为一个列表的一个顶级接口
        // 两个重要的实现类 ArrayList （内部是用数组实现的）
        // 还有一个LinkedList（链表结构）
        // add remove addAll removeAll isEmpty size clear
        List list = new ArrayList();
        // 数组的长度怎么获取？  通过length 属性
        System.out.println(list.size());

        // 添加元素
        list.add("你的头发还好吗？");
        User u = new User();
        u.setAge(18);
        u.setName("东方");
        list.add(u);
        System.out.println(list.size());
        list.remove("你的头发还好吗？");
        User u2 = new User();
        u2.setAge(18);
        u2.setName("东方");
        System.out.println(list.size());
        list.remove(u2);
        System.out.println(list.size());
        list.remove(u);
        System.out.println(list.size());

    }
}
