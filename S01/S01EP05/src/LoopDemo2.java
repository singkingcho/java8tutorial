/**
 * 如何解决重复性的工作,
 * 任何一门成熟的编程语言,都会提供循环.
 * [一]  while循环
 */
public class LoopDemo2 {

    public static void main(String[] args) {


        // ()内部接收一个表达式  ,其结果必须为布尔值
        // 循环需要一个标记来进行控制

        int counter = 0;
        // 第一次去判断的时候,用的0还是1
        while(counter ++ <= 100) {
            System.out.println("好好学习,天天向上");
        }


    }
}
