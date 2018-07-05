package com.exam;

import java.util.Scanner;

public class Exam4 {


    public static void main(String[] args) {
        // 1 01 101 0101 10101
        System.out.println("请输入要显示的行数：");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();


        for(int i = 0; i < len; i ++) {
            if(i % 2 == 0){
                // 奇数开头
                for(int j = 0 ; j <= i; j ++) {
                    if(j % 2 == 0){
                        System.out.print(1 + "\t");
                    } else {
                        System.out.print(0 + "\t");

                    }
                }
                System.out.println();

            } else {
                for(int j = 0 ; j <= i; j ++) {
                    if(j % 2 == 0){
                        System.out.print(0 + "\t");
                    } else {
                        System.out.print(1 + "\t");

                    }
                }
                System.out.println();

            }
        }



    }
}
















