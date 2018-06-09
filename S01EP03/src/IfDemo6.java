import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 */
public class IfDemo6 {


    // demo6
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
        // 只要满足两个条件即可，统计满足条件的个数就行了
        int count = 0;
        if(flag1)
            count++;
        if(flag2)
            count++;
        if(flag3)
            count++;

        if(count >= 2) {
            System.out.println("红旗轿车");
        } else {
            System.out.println("拖拉机");
        }






    }
}
