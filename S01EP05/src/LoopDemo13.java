public class LoopDemo13 {


    public static void main(String[] args) {

        // 求1+2!+3!+...+10!的和
        //  n!

        // 分而治之
        int multi = 1;
        int sum = 0;
        for(int i = 1 ; i<=10 ; i++){
            multi *= i;
            sum += multi;
        }
        System.out.println(sum);

    }
}
