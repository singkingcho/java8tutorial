import javax.sound.midi.SysexMessage;
import java.util.Calendar;
import java.util.Scanner;

public class Demo8 {

    public static void main(String[] args) {
        // 链子
        // 异常链，在你的程序里面，不同方法之间调用，整个调用的关系上面呢，可能出现了不同的异常
//        到底在哪处理
        show();
    }

    // Exception 分为两种  检查异常，运行时异常
    public static void show() {
        try{
            System.out.println(3/0);
        } catch (Exception e){
            System.out.println("我在show里面处理异常");
        }

    }
}
