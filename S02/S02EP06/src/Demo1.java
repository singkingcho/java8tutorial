import java.util.Scanner;

public class Demo1 {


    /**
     * 没有使用异常处理机制解决保障用户输入正确整数的问题
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("请输入一个数字：");
            // 判断下一个是不是我们的数字 ，如果是，我们打印出来，然后结束，如果不是，重新让录入
            if(scanner.hasNextInt()){
                // 不会有异常风险。
                num = scanner.nextInt();
                System.out.println("您输入的数字正确：" + num);
                break;
            } else {
                // 如果输入有问题，也简单，调用next
                System.out.println("您输入的数字有问题，请重新输入");
                // 将之前的内容给刷掉
                scanner.next();
            }
        }while(true);


    }
}
