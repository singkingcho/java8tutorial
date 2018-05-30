import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class ArithmeticaDemo {


    public static void main(String[] args) {
        // 求长方形面积
        // 写死了值 ， 使用扫描器接受我们用户输入的值
        // 是一个对象，用来得到我们用户输入内容的。 IO
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入长:");
        // 接收用户下次输入的内容
        double a = scanner.nextDouble();
        System.out.println("请输入宽:");
        double b = scanner.nextDouble();
        double s = a * b;
        System.out.println("面积为：" + s);

    }


}












