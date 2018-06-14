/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class LogicOperator4 {


    public static void main(String[] args) {
        // 短路的与 &&

        boolean b1 = false;
//        boolean b2 = ;

        // 短路的特点是，当前面的一个表达式能够决定真假，那么后面的值将不会去判断
        // 省时间，屏蔽掉一些错误

        // 当B1为false的时候，根据短路的特点，已经决定整个表达式为false，所以 (1/0==1)没有去判断，无法报错。
        boolean b3 = b1 && (1/0==1);
        System.out.println(b3);
        // 短路的或，只要前面为真不判断后面， 短路的与，当前面为假，后面就不判断了。


    }
}
