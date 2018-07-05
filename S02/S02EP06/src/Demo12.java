import java.util.Scanner;

public class Demo12 {


    public static void main(String[] args) {

        devide();

    }

    public static void devide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个非零的整数");
        int num = scanner.nextInt();
        if(num == 0){
            // 从系统的角度来讲没问题，不符合需求，像这种我们也可以主动的视为异常
            // 前面是由JVM生产异常对象，现在呢是我们自己主动搞出一个异常对象
            throw new RuntimeException("除数不能为0");
        } else {
            System.out.println(100/num);
        }
    }
}
