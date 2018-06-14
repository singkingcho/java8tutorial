import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 */
public class IfDemo7 {


    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("请您输入一个你喜欢的女明星：");
        String str = scanner.next();
        // 只要 这个人不是杨幂，我就给你10万
        if(!str.equals("杨幂")) {
            System.out.println("给你十万");
        }

//        if(str.equals("杨幂")) {
//            System.out.println("你很帅");
//        } else {
//            System.out.println("杨幂脚臭");
//        }
    }
}
