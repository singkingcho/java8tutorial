import java.util.Scanner;

public class LoopDemo7 {


    public static void main(String[] args) {

        // do while 循环
        Scanner scanner = new Scanner(System.in);
        String result = null;

        /**
         * while循环是先判断,后执行
         * do while 是先执行, 后判断
         *   while 并不一定能保障执行
         *   do while  至少能执行一次
         *
         *  语法的细节上面有点区别
         *  while(){
         *
         *  }
         *
         *
         *  do{
         *
         *  }while();
         *
         *
         */
        do{
            System.out.println("请问您继续吃雪糕吗?");
            result = scanner.next();
            if(result.equals("n"))
            break;

        }while(true);

    }
}
