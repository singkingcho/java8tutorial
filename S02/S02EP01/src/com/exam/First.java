package com.exam;

import java.util.Scanner;

/**
 *  
 * @author alexcheng
 * time:2018-6-13下午1:31:15
 */
public class First {

	/**
	 * 新一个数组
	 * 不排序
	 * 找出第二小的数
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] num=new int[5];
		System.out.println("请输入整数：");
		for (int i = 0; i < num.length; i++) {
			num[i]=input.nextInt();
		}
		int min1=num[0],min2=num[0];
		for (int i = 1; i < num.length; i++) {
			if(num[i]<min2){
				if(num[i]<min1){
					min2=min1;
					min1=num[i];
				}else{
					min2=num[i];
				}
			}
		}
		System.out.println("最小数："+min1+" 第二最小数："+min2);
	}

}
