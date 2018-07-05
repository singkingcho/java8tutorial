package com.exam;

import java.util.Scanner;

/**
 *  
 * @author alexcheng
 * time:2018-6-13下午2:25:33
 */
public class Four {

	/**
	 * 1
	 * 01
	 * 101
	 * 0101
	 * 10101
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行数：");
		int num=input.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <=i; j++) {
				if((i+j)%2==0){		//位置坐标,相加偶数输出1
					System.out.print(1);
				}
				if((i+j)%2!=0){		//相加奇数输出0
					System.out.print(0);
				}
			}
			System.out.println("");
		}
	}

}
