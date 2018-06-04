import java.util.Scanner;

public class SwitchDemo2 {


    public static void main(String[] args) {
        // 使用switch解决
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字");
        int num = scanner.nextInt();

        // case后跟上固定值,JDK7前只可以使用整数,7以后可以支持String
        switch(num) {
            case 1:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期一");
                // 当break没有写, 如果没有break掉,那么它会一直执行到下一个break
//                break;
            case 2:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期二");
//                break;

            case 3:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期三");
                break;
            case 4:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期四");
                break;
            case 5:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期五");
                break;

            case 6:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期六");
                break;
            case 7:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期天");
                break;
                // 就是当其它的都不满足的话,会跑到这里来执行
            // default 一般放在最后面
            default:
                System.out.println("天堂里面没有星期");
                break;


        }


        System.out.println("switch结束了");
    }
}
