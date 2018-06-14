import java.util.Scanner;

public class Demo2 {


    public static void main(String[] args) {

        /*


        1
        23
        456
        78910
        11
        16

        // n = 2开始都是满足的
        sn = sn-1+n-1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        int num = scanner.nextInt();
        int item = 0;
        for(int i = 0 ; i < num ; i ++) {
            if(i == 0) {
                item = 1;

            } else {
                item +=  i;
            }
            for(int j = 0 ; j <= i ; j++) {
                System.out.print(item+j + "\t\t");
            }
            System.out.println();
        }

    }
}
