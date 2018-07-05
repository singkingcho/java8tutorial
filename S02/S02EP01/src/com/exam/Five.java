package com.exam;

/**
 *  
 * @author alexcheng
 * time:2018-6-13下午3:31:12
 */
public class Five {

	/**
	 * 显示前20个斐波纳契数字F(n)
	 * F(n)=F(n–1)+F(n–2)
	 * F(1)=F(2)=1
	 * 计算平均值
	 */
	public static void main(String[] args) {
		int[] num=new int[20];
		int len=num.length;
		num[0]=1;
		double sum=0;//总和
		for (int i = 0; i < len; i++) {
			if(2<=i){
				num[i]=num[i-1]+num[i-2];
				System.out.print(num[i]+" ");
			}else if(0<i && i<2){
				num[i]=num[i-1];
				System.out.print(num[i]+" ");
			}else{
				System.out.print(num[i]+" ");
			}
			sum+=num[i];
		}
		System.out.println("\n斐波纳契数前20平均数："+sum/len);
	}

}
