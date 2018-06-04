import java.util.Scanner;

/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 */
public class IfDemo9 {


    public static void main(String[] args) {

        // if else 能搞定的代码，java提供了一种简便的方式
        //  表达式 ? exp1:exp2

        Scanner scanner = new Scanner(System.in);
        // 法语糖
        System.out.println("请输入你是否成年？");
        String answer = scanner.next();


        // answer.equals("y") == true 三目只用于非常简单的if else
        System.out.println(answer.equals("y") ? "请进入":"请您十八岁后再来！");
        //
//        if(answer.equals("y")) {
//            System.out.println("请进入");
//        } else {
//            System.out.println("请您十八岁后再来！");
//        }

        // 伪代码写法 翻译成真是的代码
        /*
            if（w chile饭） {
                我去前面看看
           } else {

           }
         */
    }

}
