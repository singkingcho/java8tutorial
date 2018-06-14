import java.util.Scanner;

public class LoopDemo6 {


    public static void main(String[] args) {

        //  你询问顾客,你是否继续下注

        System.out.println("高进先生,请问您是否继续下注?(50块)");
        Scanner scanner = new Scanner(System.in);
        String result = null;
        while (true){
            result = scanner.next();
            if(result.equals("n")) {
                // 如何停下来,在java里面提供了一个关键字 break
                // 1 结束swtich结构, 二 循环里用于结束循环
                break;
            }
            System.out.println("下注成功");
            System.out.println("高进先生,请问您是否继续下注?(50块)");
        }

        System.out.println("赌局结束");

    }
}
