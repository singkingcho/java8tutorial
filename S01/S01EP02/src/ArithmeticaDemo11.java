import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class ArithmeticaDemo11 {


    public static void main(String[] args) {

        // java里面我比习惯这么写。
//        int c, d ,f;
//
//        c = d = f = 5;

        int c;
        int d;
        int f;


        // 换数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();
        // 不声明额外变量完成交换
        //
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

}












