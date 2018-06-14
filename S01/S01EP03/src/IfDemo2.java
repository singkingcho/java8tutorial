// 导入包 ，  别人写好的一些java类，供我们使用 import关键字 必须在类的上面
// java.util.Scanner  java.util = 几层的文件夹  最后面的Scanner 就是要给类
import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 * demo：案例的意思，范例 ，演示。
 */
public class IfDemo2 {



    public static void main(String[] args) {

        // 接受用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的选择（1 代表进入 0 代表退出）");
        // 必须要根据用户输入来决定给出什么反馈
        // java提供关键字 if
        // ()里面接受布尔值
        int num = scanner.nextInt();
        // 下面代码是可以的,新手不推荐用
        if(num == 1) System.out.println("请您进入");
        // 如果省略了大括号，从第二行起，都不再属于if的代码块
        System.out.println("撒大苏打撒");



    }


}

























