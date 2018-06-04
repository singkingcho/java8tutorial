/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 * // 第九个练习题
 */
public class Execise9 {

    public static void main(String[] args) {

        char a = 'a';
        char b = 97;
//        char b = '333';

        char c = 3;

        System.out.println(b == a);

        // \n \t \\
        char d = '/';
        char e = '\\';
        System.out.println(d);
        System.out.println(e);


//        double f = 3.00055E3;
        double f = 3.5E0;
        System.out.println(f);

        //
        boolean flag = !(3>4|5!=5&3<4*0);
        System.out.println(flag);

        char a1 = 'a';
        char a2 = 'b';
        // 数字
        String b1 = "a";
        String b2 = "b";

        // 原因是参与的数学运算，所以要先变为数字，查表，a  97
        System.out.println(a1+a2);
        System.out.println(b1+b2);

        // ! 优先级》& > |
        System.out.println(!false&false);


    }
}
