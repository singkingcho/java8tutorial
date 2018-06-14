public class LoopDemo9 {


    public static void main(String[] args) {



        // 如果是奇数就不乘
        int multi = 1;
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0) {
                multi *= i;
            } else{
            }
        }
        System.out.println(multi);

    }
}
