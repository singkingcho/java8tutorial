import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class ArithmeticaDemo10 {


    public static void main(String[] args) {

        // 换数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();

        // 怎么换数
        // 借助一个临时中间量
        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("换数之后是：a:" + a + "b:" + b );




        
    }

    
}












