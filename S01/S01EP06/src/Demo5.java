import java.util.Scanner;

public class Demo5 {


    public static void main(String[] args) {
        // 回文数
        /*
                1
               212
              32123


            每一行第一个数是行号
            1  3333
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        int num = scanner.nextInt();
        System.out.println();

        num = num % 2 == 0 ? num/2 : num/2 + 1;

        for(int i = 1 ; i <= num; i++) {
            // 每一行起始位置的数 i
            // 数量 2i - 1
            // 空格数量 num - i
            for(int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }

            // 数的变化规律 i i - 1   1  2    i-1 i
            for(int j = 1 ; j <= i; j ++ ) {
                System.out.print(i-j + 1);
            }
            for(int j = 1 ;  j < i; j ++) {
                System.out.print(j+1);
            }
            System.out.println();
        }


        for(int i = 1 ; i < num; i++) {
            // 每一行起始位置的数 i
            // 数量 2i - 1
            // 空格数量 num - i
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for(int j = num-i; j >= 1; j --) {
                System.out.print(j);
            }

            for(int j = 2; j <= num - i; j ++) {
                System.out.print(j);
            }

            System.out.println();

        }
    }

}





































