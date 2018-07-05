import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo111 {


    /**
     * 使用异常机制保障用户输入正确的整数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("请输入一个数字：");
            try {
                num = scanner.nextInt();
                System.out.println("输入正确：" + num);
                break;
            } catch (InputMismatchException e){
                System.out.println("您输入有误。");
                scanner.next();
            }


        }while(true);
    }
}
