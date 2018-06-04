// 导入包 ，  别人写好的一些java类，供我们使用 import关键字 必须在类的上面
// java.util.Scanner  java.util = 几层的文件夹  最后面的Scanner 就是要给类
import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 * 【需求：】
 *      输入你的考试成绩
 *          根据成绩的区段分别给出
 *              优91-100
 *              良8190
 *              好71-80
 *              中等60-70
 *              差
 *              59
 */
public class IfDemo4 {

    public static void main(String[] args) {
        // if else解决不了两种情况以上
        // java提供了 else if
        // else 就有一层隐藏的含义，就是否定前面的
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入你考试的成绩");
        int score = scanner.nextInt();
        // 0 -100 合理情况下
        if (score <= 100 && score >= 91) {
            System.out.println("优");
            // 有的可以连写
        } else if (score <= 90 && score >= 81 ) {
            System.out.println("良");
        } else if(score <= 80 && score >= 71) {
            System.out.println("好");
        } else if(score <= 70 && score >= 60) {
            System.out.println("中等");
        } else if(score >= 0 && score < 60) {
            System.out.println("差");
        } else {
            System.out.println("您输入的成绩有误！");
        }



    }

}

























