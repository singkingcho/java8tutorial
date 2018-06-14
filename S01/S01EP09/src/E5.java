public class E5 {


    public static void main(String[] args) {
        // 斐波那吔数列
        //  1 2 项规定为1，从第三项开始
        // Fn =  Fn-1 + Fn-2
        int sum = 0 ;
        int prev = 0;
        int mid = 0;
//        int next = 0;
        for(int i = 1 ; i <= 20 ;i ++){
            if(i == 1 || i == 2){
                mid = 1;
                prev = 1;
            } else {
                int tmp = prev;
                prev = mid;
                mid += tmp;

            }
            System.out.println(mid);
            sum += mid;
        }
        System.out.println("平均值：" + sum / 20.0);
        // modify test
    }


}























