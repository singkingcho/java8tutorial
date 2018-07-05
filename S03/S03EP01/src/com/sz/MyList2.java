package com.sz;

// 全部都是java.util包下面
import com.sz.mode.User;

import java.util.ArrayList;
import java.util.List;

public class MyList2 {


    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println(list.size());
        // 添加元素
        list.add("你的头发还好吗？");
        User u = new User();
        u.setAge(18);
        u.setName("东方");
        list.add(u);
        List list2 = new ArrayList();
        list2.add("老大不小");
        list2.add("老而不尊");
        list.addAll(list2);
        System.out.println(list.size());
        list.removeAll(list2);
        System.out.println(list.size());

    }


}
