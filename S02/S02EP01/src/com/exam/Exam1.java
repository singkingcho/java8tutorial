package com.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len = scanner.nextInt();

//        int[] arr = new int[len];


//        for(int i = 0 ; i < len ; i ++) {
//            arr[i] = (int)(Math.random()*30);
//
//        }
        int[] arr = {1,2};
        len = arr.length;

        System.out.println(Arrays.toString(arr));

        // 循环比较
        if(len > 1){
            // 存在可能
            int min = arr[0];

            // 寻找一个值，是除了它之外的最小值。
            for(int i = 0; i < len ; i ++) {
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            // 最小值出来了。
            // 第二小怎么找
            int secondMin = arr[0];

            for(int i = 0 ; i < len ; i++) {
                // 排序后再找肯定可以
                // i = 0 2 -1 = 1
                if(secondMin == min){
                    if(i < len -1) {
                        secondMin = arr[i+1];
                        continue;
                    }

                }
                if(arr[i] != min){
                    // 可以吗？
                    if(secondMin > min && secondMin > arr[i]) {
                        secondMin = arr[i];
                    }
                }
            }


            if(secondMin == min){
                System.out.println("没有第二小的值，大家都相等");
            } else {
                System.out.println(secondMin);
            }


        } else {
            System.out.println("数组元素只有一个，第二小不存在");
        }


    }
}
