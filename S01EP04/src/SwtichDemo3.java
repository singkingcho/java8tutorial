import java.util.Scanner;

public class SwtichDemo3 {


    public static void main(String[] args) {

        // 发生了什么? 隐转
        double a = 3;
        int b = (int) a;
        long c = 333L;

        // 不支持long
        // String
        // 请问你是什么年(少年, 青年, 中年,老年)
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问你是什么年(少年, 青年, 中年,老年)");

        String answer = scanner.next();
        // 虽然可以嵌套,永远都不要这么干
        switch (answer) {
            case "少年":
                System.out.println("少年包青天");
                break;
            case "青年":
                System.out.println("青年公寓之蜗居");
                break;
            case "中年":
                System.out.println("啤酒肚");
                break;
            case "老年":
                System.out.println("老骥伏枥,志在千里");
                break;
            default:
                System.out.println("乳臭未干的小子,赶紧回家吃饭");
                break;
        }



    }
}
