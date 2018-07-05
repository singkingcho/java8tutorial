import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        try {
            double num = scanner.nextDouble();
            // 唯一的特例，虚拟机主动退出，这一行一旦执行，其它任何代码都意味着已经结束
            System.exit(1);
        } catch (InputMismatchException e){
            System.out.println("输入不匹配");
        }finally {
            System.out.println("我是finally");
            scanner.close();
        }


    }

}
