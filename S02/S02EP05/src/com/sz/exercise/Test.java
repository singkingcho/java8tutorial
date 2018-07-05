package com.sz.exercise;

public class Test {

    public static void main(String[] args) {
        Point start = new Point(0,0);
        Point end = new Point(3,4);
        Line line = new Line(start,end);
        System.out.println(line.getLength());
    }
}
