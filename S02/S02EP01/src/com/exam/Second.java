package com.exam;

/**
 *  
 * @author alexcheng
 * time:2018-6-13下午1:55:46
 */
public class Second {

	/**
	 * 总共50，30人
	 * 男3，女2，小孩1
	 * 各多少人
	 */
	public static void main(String[] args) {
		int man,women,chil=0;
		for (man = 0; man < 30; man++) {
			for (women = 0; women < 30-man; women++) {	//确定女士人数
				chil=30-man-women;		//确定小孩人数
				if(man*3+women*2+chil*1==50){
					System.out.println("男士："+man+" 女士："+women+" 小孩："+chil);
				}
			}
		}
	}

}
