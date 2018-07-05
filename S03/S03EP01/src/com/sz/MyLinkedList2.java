package com.sz;

import java.util.LinkedList;

public class MyLinkedList2 {

    public static void main(String[] args) {
        // LinkedList 一样有序，有下标 ，可以重复，插入删除的效率比较高，查询的效率比较低。
        LinkedList ll = new LinkedList();
        // 推在栈顶
        ll.push("p1");
        ll.push("p2");
        ll.push("p3");
        ll.push("p4");

        for (Object obj: ll) {
            System.out.println(obj);
        }
        System.out.println(ll.get(0) + "000");
        System.out.println(ll.get(3) + "3333");
        Object pop = ll.pop();
        System.out.println(pop);
    }
}
