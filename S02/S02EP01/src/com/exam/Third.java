package com.exam;

import java.util.Scanner;

/**
 *  
 * @author alexcheng
 * time:2018-6-13下午2:04:25
 */
public class Third {

	/**
	 * 基本工资4000
	 * 每个月的比例
	 * 0-3000:0
	 * 3001-5000:1%
	 * 5001-10000:0.8%
	 * 1001~：0.5%
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean isRight=true;		//判断是否继续输入
		String choice;
		double score;		//业绩
		do{
			System.out.println("销售成绩\t\t提成率");
			System.out.println("0-3000\t\t\t0");
			System.out.println("3001-5000\t\t1%");
			System.out.println("5001-10000\t\t0.8%");
			System.out.println("10001~\t\t\t0.5%");
			System.out.println("请输入员工的销售成绩：");
			//业绩不一定是整数
			score=input.nextDouble();
			if(score<=3000){
				System.out.println("基本工资:4000");
			}else if(3000<score & score<=5000){
				System.out.println("工资："+(4000+(score-3000)*0.01));
			}else if(5001<score & score<=10000){
				System.out.println("工资："+(4000+(score-5000)*0.008+(2000*0.01)));
			}else {
				System.out.println("工资："+(4000+(score-10000)*0.005+5000*0.008+2000*0.01));
			}
			//员工多次输入循环
			System.out.println("是否继续(n退出)：");
			if("n".equalsIgnoreCase(choice=input.next())){
				isRight=false;
			}else{isRight=true;}
		}while(isRight);
		System.out.println("已退出程序");
	}

}
