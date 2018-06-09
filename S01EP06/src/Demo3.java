import java.util.Scanner;

public class Demo3 {


    public static void main(String[] args) {

        /*

                    *
                   ***
                  *****
            1 行 1
            2 行 3
            3 行 5
            sn = 2*n-1

        num
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        int num = scanner.nextInt();

        for(int i = 0 ; i < num ; i ++) {
            // 空白符号的个数 =  num - i -1
            // 再输出  2*(i+1)-1 个星号
            for(int j = 0 ; j < num - i -1; j ++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*(i+1)-1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
