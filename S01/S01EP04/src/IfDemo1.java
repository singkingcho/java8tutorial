import java.util.Scanner;

public class IfDemo1 {


    public static void main(String[] args) {

        // 【需求】 通过用户输入1-7（整数） 然后输出是星期几

        Scanner scanner = new Scanner(System.in);

        // 接收输入
        System.out.println("请输入1-7的整数：");
        int num = scanner.nextInt();
        // 数字比较使用 ==   字符串要使用 equals
        if(num == 1){
            System.out.println("今天星期一");
        } else if (num == 2) {
            System.out.println("今天星期二");
        } else if (num == 3) {
            System.out.println("今天星期三");
        } else if (num == 4) {
            System.out.println("今天星期四");
        } else if (num == 5) {
            System.out.println("今天星期五");
        } else if (num == 6) {
            System.out.println("今天星期六");
        }  else if (num == 7) {
            System.out.println("今天星期日");
        } else {
            System.out.println("你星期有问题");
        }


    }
}
