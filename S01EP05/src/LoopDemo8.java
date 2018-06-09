public class LoopDemo8 {


    public static void main(String[] args) {


        //  1 * ---10

        // for循环的语法如下,最简洁的方式就是下面的方式
        // exp1  ;  exp2 ; exp3
        // expression
        // exp1:初始化部分,只跑一次
        // exp2:判断的条件
        // exp3:循环条件的迭代
        //!3
        int multi = 1;
        for(int i = 1; i <= 20; i++){
            multi *= i;
        }

        System.out.println("1*--10:" + multi);

    }
}
