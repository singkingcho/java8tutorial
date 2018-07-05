package com.sz;

// 全部都是java.util包下面
import com.sz.mode.User;

import java.util.ArrayList;
import java.util.List;

public class MyList3 {


    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println(list.size());
        // 添加元素
        list.add("你的头发还好吗？");
        User u = new User();
        u.setAge(18);
        u.setName("东方");
        list.add(u);
        // 判断方法，是否有某个元素
        if(list.contains("你的头发还好吗？")){
            System.out.println("已经存在");
        } else {
            System.out.println("不存在");
        }

        // 清楚所有元素
        //list.clear();
        System.out.println(list.size());

        // 列表，就是由下标的，所以我们还有get方法区获取指定的元素（通过索引）,如果这个索引之处没有元素会引发下标越界的问题
        System.out.println(list.get(0));
        // 这个是获取某个元素在这个集合当中下标
        System.out.println(list.indexOf(u));
    }


}
