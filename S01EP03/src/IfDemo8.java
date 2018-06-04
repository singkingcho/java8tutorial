import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 * 嵌套if的使用
 */
public class IfDemo8 {


    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("我是汪主任，请问你准备好了没有：");

        System.out.println("我现在这里有三个题供你选择" +
                "1 历史题 ， 2 科技题 ， 3 体育题");
        int choice = scanner.nextInt();

        // java里面 大括号是作为作用域范围
        String answer = "";
        if(choice == 1) {
            System.out.println("请问秦朝建立于公元前223年，对吗？");
            answer = scanner.next();
            if(!answer.equals("y")) {
                System.out.println("您回答正确，请问继续吗？");
                answer = scanner.next();
                if(answer.equals("y")) {
                    // 问第二题
                    System.out.println("李世民是汉朝人正确吗？");
                    answer = scanner.next();
                    if(!answer.equals("y")) {
                        System.out.println("恭喜你，两个都回答正确，奖励一个  瑞文手办");
                    } else {
                        System.out.println("很遗憾，没有奖励");
                    }
                } else {
                    System.out.println("恭喜你，回答对了1道题");
                    System.out.println("奖励82年的雪碧");
                }
            } else {
                System.out.println("很遗憾，一个都没对，奖励一盆辣椒水");
            }
        } else if(choice == 2) {

        } else if (choice == 3) {

        } else {
            System.out.println("出去");
        }


    }
}
