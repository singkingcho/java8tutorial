import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Demo1 {


    public static void main(String[] args) {

        /*
        1
        12
        123

        ****
        ****
        ****
       for(int i = 0 ; i < 3; i ++){
            System.out.println("*****");
        }

        【二】
        *
        **
        ***
        *
        *
        *   for(int i = 0 ; i < 3; i ++){
            // 怎么控制星号的数量
            // 跟随i改变而改变
            // 还需要一个变量来控制输出的*
            // i j k m n l   o p q
            for(int j = 0; j <= i; j ++  ) {
                //
                System.out.print("*");
            }
            System.out.println();
        }


        1
        12
        123

           for(int i = 0 ; i < num; i ++) {
            for(int j = 0 ; j <= i ; j ++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想输出的行数：");
        int num  = scanner.nextInt();

        /*
        1
        12
        123

         */
        for(int i = 0 ; i < num; i ++) {
            for(int j = 0 ; j <= i ; j ++) {
                System.out.print(j+1);
            }
            System.out.println();
        }



    }
}
