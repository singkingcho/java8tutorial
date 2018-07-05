import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {


    public static void main(String[] args) {
        int a = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个数");

        try{
            int num = scanner.nextInt();
            System.out.println(a/num);
            System.out.println("=====");
        } catch(InputMismatchException e){
            // 如果书写的异常类之间存在父子关系，必须子在前，父在后。
            System.out.println("输入不匹配");
        } catch(Exception e){
            System.out.println("有错误");
        }
    }



}
