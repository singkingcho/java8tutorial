public class LoopDemo10 {


    public static void main(String[] args) {

        // continue关键字,  结束本次小循环 , 大循环没有结束
        int i = 1;
        int sum = 0;
         for (;
              i < 10 ;
              i++) {
             System.out.println("我进来.....");
            if(i % 3 == 0){
                continue;
            }
            // 一旦continue,那么它后面的代码不会执行,直接去了exp3
            sum += i;
         }

        System.out.println(sum);
    }
}
