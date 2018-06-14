/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 *   数据类型转换
 *   前提要求：
 *              数据要兼容
 *
 *   转换类型：
 *              JDK自动转换 隐式转换
 *              程序员手工强转（有风险，有不可估计的情况） 显式转换
 *
 */
public class Variable5 {


    public static void main(String[] args) {

        // 报错？  3  是int   a  是 long
        // 自动进行的
        // 0011
        // 00000000
        // 00000011
        long a = 3;

        System.out.println(a);
    }


}
