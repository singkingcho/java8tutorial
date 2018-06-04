// 导入包 ，  别人写好的一些java类，供我们使用 import关键字 必须在类的上面
// java.util.Scanner  java.util = 几层的文件夹  最后面的Scanner 就是要给类
import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 * demo：案例的意思，范例 ，演示。
 */
public class IfDemo {



    public static void main(String[] args) {

        // 接受用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的选择（1 代表进入 0 代表退出）");
        // 必须要根据用户输入来决定给出什么反馈
        // java提供关键字 if
        // ()里面接受布尔值
        int num = scanner.nextInt();
        if(num == 1) {
            // 这里的所有代码，都必须在if里面的条件满足的情况下才能执行。
            System.out.println("请您进入");
        }
        // 没有大括号，如果if后面只有一行代码，可以省略{}


    }


}

























