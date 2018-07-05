package com.exam;

public class Exam2 {


    /**
     * 有30人，可能包括男人、女人、小孩，他们在一饭店共消费50先令，其中每个男人花3先令，
     * 每个女人花2先令， 	每个小孩花1先令，求男人、女人、小孩各多少人
     * @param args
     */
    public static void main(String[] args) {

        int man = 0;
        int girl = 0;
        int child = 0;
        // 假定i代表男
        // j 代表女
        //  k代表小孩
        for(int i = 0; i <= 30;i++){
            for(int j= 0 ; j <= 30; j ++) {
                for(int k = 0 ; k <= 30 ; k++) {
                    int totalPeople = i + j + k;
                    int sum = i *3 + j * 2 + k;
                    if(totalPeople == 30 && sum == 50){
                        System.out.println("男：" + i + "女：" + j + "小孩：" + k);
                    }
                }
            }
        }
    }
}
