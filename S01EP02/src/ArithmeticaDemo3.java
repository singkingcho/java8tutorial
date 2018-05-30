/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class ArithmeticaDemo3 {


    public static void main(String[] args) {

        //
        int a = 1000000000;
        int b = 0;
        int c = a / b;
       /* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ArithmeticaDemo3.main(ArithmeticaDemo3.java:14)
        数学运算异常，
*/
        System.out.println(c);

    }


}












