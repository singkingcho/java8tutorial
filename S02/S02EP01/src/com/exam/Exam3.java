package com.exam;

import java.util.Scanner;

public class Exam3 {

    /**
     * 某公司业务员的基本工资为4000元,
     * 提成方案如下:根据每月的销售额提成比例如下:
     * 注意是分区段计算提成(15分)输入员工的销售额计算其工资并打印
     * @param args
     */
    public static void main(String[] args) {
        //
        System.out.println("请输入本月的销售额：");
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        int sum  = 4000;
        if(money <= 3000) {

        } else if (money >3000 && money <= 5000){
           sum += ( money-3000)* 0.01;
        } else if(money > 5000 && money <= 10000){
            sum += 2000*0.01 + (money-5000)*0.008;
        } else {
            sum += 2000 * 0.01 + 5000 * 0.008 + (money - 10000) *0.005;
        }
        System.out.println("收入为：" + sum);
    }

    //

}















