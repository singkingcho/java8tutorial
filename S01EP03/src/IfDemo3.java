// 导入包 ，  别人写好的一些java类，供我们使用 import关键字 必须在类的上面
// java.util.Scanner  java.util = 几层的文件夹  最后面的Scanner 就是要给类
import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 * demo：案例的意思，范例 ，演示。
 */
public class IfDemo3 {

    public static void main(String[] args) {
        // 接受用户输入
        Scanner scanner = new Scanner(System.in);
        // y 代表yes  n 代表no
        System.out.println("请问您是man吗 y/n ？");
        String answer = scanner.next();
        // 特殊 本身是空 不等同 ""
        String str = null;
        // java里面的字符串的比较不能使用== ，
        // equals比较
//        System.out.println(answer == "y");

        // 比较可以忽略大小写Ignore 忽略 无视
        //         anotherString ： 引导作用，告诉你怎么去写
        if(answer.equalsIgnoreCase("y")) {
            System.out.println("请你喝一杯二锅头");
        } else {
            System.out.println("请你喝杯奶茶");
        }

//        if(answer.equals("y")) {
//            System.out.println("请你喝一杯二锅头");
//        } else {
//            System.out.println("请你喝杯奶茶");
//        }

    }


}

























