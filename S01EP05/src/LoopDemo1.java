/**
 * 如何解决重复性的工作,
 * 任何一门成熟的编程语言,都会提供循环.
 * [一]  while循环
 */
public class LoopDemo1 {

    public static void main(String[] args) {


        // ()内部接收一个表达式  ,其结果必须为布尔值
        // 循环需要一个标记来进行控制
        boolean isOver = false;
        // 定义一个计数器统计 , 打印了多少次
        int counter = 0;
        while(!isOver) {
            //
            System.out.println("好好学习,天天向上");
            counter++;
            if(counter == 100) {
                isOver = true;
            }
        }
    }
}
