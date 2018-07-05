package com.sz.test;

public class Test8 {


    public static void main(String[] args) {

        VariableLengthArgumentsMethod v = new VariableLengthArgumentsMethod();
        int sum = v.sum(1, 3, 5, 66);
        System.out.println(sum);

    }
}
