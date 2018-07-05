package com.sz.test;

import com.sz.model.Student;

import java.util.*;

public class MySuperList {

    public static void main(String[] args) {

        List<Map<String,Student>> l  = new ArrayList<>();
        Map<String,Student> map = new HashMap<>();
        Map<String,Student> map2 = new HashMap<>();
        Student s = new Student(12,"小冬瓜");
        Student s2 = new Student(18,"大冬瓜");
        Student s3 = new Student(24,"矮冬瓜");
        Student s4 = new Student(30,"老冬瓜");
        map.put("d1",s);
        map.put("d2",s2);
        map2.put("d3",s3);
        map2.put("d4",s4);
        l.add(map);
        l.add(map2);

        Iterator<Map<String, Student>> it = l.iterator();
        while(it.hasNext()){
            Map<String, Student> m = it.next();
            Iterator<Map.Entry<String, Student>> iterator = m.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String, Student> entry = iterator.next();
                String key = entry.getKey();
                Student value = entry.getValue();
                System.out.println("key :" + key + ", value :" + value);
            }
        }

    }
}
