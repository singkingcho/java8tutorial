import java.util.Scanner;

public class Demo2 {


    public static void main(String[] args) {
        int a = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个数");
        int num = scanner.nextInt();
        try{
            System.out.println(a/num);
            System.out.println("我是00厚");
            // catch 括号当中的内容的作用是什么？  它是定义的一个异常类，如果这个类与发生的异常匹配，那么
//            jvm会帮我们创建一个异常的对象
            // 如果出现的异常是输入了一个非数字
        }
        catch (ArithmeticException e){
            System.out.println("数学异常");
        }

    }
}
