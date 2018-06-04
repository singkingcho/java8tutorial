import java.util.Scanner;

/**
 * 文档注释，API的使用（String  length  charAt ，）
 * 应用程序接口：帮助文档
 * application Interface
 * 2.	编写一个Java程序来解决一元二次方程（使用if，else if和else）
 */
public class Exercise2 {


    public static void main(String[] args) {

        // ax2 + bx + c = 0
        // （实数范围内求解）
        /*
          1 是否有解
          2 如果you解
            有几个，分别是什么？
          3 如果没有，给出友好提示
         */

        //  b2 -4ac根据它来的
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入系数a");
        double a = scanner.nextDouble();
        System.out.println("请输入系数b");
        double b = scanner.nextDouble();
        System.out.println("请输入系数c");
        double c = scanner.nextDouble();
        //
        // 根据求解的公式可以分析出,不同的情况
        /*
            1 a = 0
            此时成为了一元一次方程
                如果 b = 0
                判断c是多少,如果不为0,该方程本身无意义
                如果 b != 0
                正常求解即可
                3 = 0

            2 a != 0
                无解
                有两个
                有一个
         */
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("该方程成立,但是无需解");
                } else {
                    System.out.println("该方程无意义");
                }
            } else {
                System.out.println("该方程为一元一次方程,有且仅有一个解:" + -(c/b));
            }

        } else {
            if((b*b - 4*a*c) > 0) {
                System.out.println("该方程有两个解分别是:");
                // 开根号,Math里面的方法
                System.out.println((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
                System.out.println((-b - Math.sqrt(b*b - 4*a*c))/(2*a));
                // 2
            } else if((b*b - 4*a*c) == 0){
                //1
                System.out.println("该方程有且仅有一个解：" + -(b/(2*a)));
            } else {
                System.out.println("该方程实数范围内无解!");
            }
        }

    }

}






















