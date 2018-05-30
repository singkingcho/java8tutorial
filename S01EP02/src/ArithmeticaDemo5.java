import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class ArithmeticaDemo5 {


    public static void main(String[] args) {

        // 分解数字 839我想知道百位是什么，十位  个位分别是多少？
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位的数字：");
        int num = scanner.nextInt();
        // 拆解百位  8 / 3 = 2  933 / 100
        // 933% 100  33
        int hundred = num / 100;
        // 10位
        int ten = num % 100 /10;
        // 个位
        int single = num % 10 ;
        System.out.println("百位是：" + hundred);
        System.out.println("十位是：" + ten);
        System.out.println("个位是：" + single);
    }


}












