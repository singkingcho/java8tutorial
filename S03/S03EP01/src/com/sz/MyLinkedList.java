package com.sz;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        // LinkedList 一样有序，有下标 ，可以重复
        LinkedList ll = new LinkedList();
        ll.add("你好真好");
        ll.add("你好真好");
        ll.add("你好真好3");
        ll.add("你好真好");
        ll.addFirst("我要当首领");
        ll.addLast("我要坐末班车");
        ll.removeFirst();
        ll.removeLast();

        // 获取最后的一个元素
        System.out.println(ll.lastIndexOf("你好真好"));
        // 从前往后找，找到一个即可
        System.out.println(ll.indexOf("你好真好"));





//
//        Iterator it = ll.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }



    }
}
