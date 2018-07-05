package com.sz.test;

import com.sz.Demo4;

import java.util.ArrayList;
import java.util.List;

public class TestDemo4 {

    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        List<Integer> l = new ArrayList<>();
        List<Double> l2 = new ArrayList<>();
        List<Number> l3 = new ArrayList<>();
        demo4.show(l);
//        demo4.show(l2);
        demo4.show(l3);
    }
}
