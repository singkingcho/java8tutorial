package com.sz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {


    public static void main(String[] args) {
        // set集合： 无序 ， 唯一（不重复）
        Set set  = new HashSet();
        set.add("s1");
        set.add("s2");
        set.add("s2");
        set.add("s3");
        set.add("s4");
        set.add("s5");
        set.add("s6");
        set.add("s7");
        set.add("s8");
        set.add("s9");
//        System.exit(1);
//        set.add("s9");
        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        // 某些东西必须是独一无二的，并且我们也不在乎这个顺序

        Object[] objects = set.toArray();
        for(int i = 0 ; i < objects.length ; i++){
            System.out.println(objects[i]);
        }





    }
}
