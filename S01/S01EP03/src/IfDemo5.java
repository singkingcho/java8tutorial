import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 */
public class IfDemo5 {


    public static void main(String[] args) {

        // if判断里面使用 或
        Scanner scanner = new Scanner(System.in);
        // 在这里面，你满足任意的 两个条件，我就给你奖励劳斯莱斯，否则四十大板
        System.out.println("请问你身高有1.7米吗？");
        String answer1 = scanner.next();
        boolean flag1 = answer1.equals("y");
        System.out.println("请问你资产有五百万吗？");
        String answer2 = scanner.next();
        boolean flag2 = answer2.equals("y");
        System.out.println("请问你有林志帅吗？");
        String answer3 = scanner.next();
        boolean flag3 = answer3.equals("y");

        // 1 2 3   1 2 1 3 23  123
        //(flag1 && flag2) 合起来作为要给表达式，结果是布尔值
        if((flag1 && flag2) || (flag1 && flag3) || (flag1 && flag2 && flag3) || (flag2 && flag3)) {
            System.out.println("奖励劳斯莱斯");
        } else {
            System.out.println("四十板子");
        }



    }
}
