package com.sz.test;

import com.sz.Demo1;
import com.sz.model.Student;

public class TestDemo1 {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小南");
        Demo1<Student> d = new Demo1<>(s);
        Student t = d.getT();
        System.out.println(t);


        Demo1<String> d2 = new Demo1<>("哈哈哈");
        System.out.println(d2.getT());

    }
}
