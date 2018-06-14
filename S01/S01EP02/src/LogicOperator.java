/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 */
public class LogicOperator {


    public static void main(String[] args) {

        // 与或非
        // & |  !
        // 你今天必须要吃了20斤肉，并且还要喝了5斤白酒，今天才可以睡觉
        // 与运算，要求全为真才能为真

        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = b1 & b2;
        System.out.println(b3);

    }
}
