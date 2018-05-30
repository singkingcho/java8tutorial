import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class ArithmeticaDemo6 {


    public static void main(String[] args) {

       int a = 3;
       // ++ 有前++  后++
//        // 一元运算符
        //后自增而言，它会先把值输出，然后自增的效果，要再之后才能体现，滞后。
        System.out.println(a++);
//        a++;
        System.out.println(a);

        int b = 3;

        // 如果你觉得看起来不好理解，可以使用() 作为一个整体，()拥有最高的优先级
        System.out.println("b:" +  (++b));


    }

    
}












