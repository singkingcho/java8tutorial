import java.util.Scanner;

public class Demo6 {


    public static void main(String[] args) {

        // 圣诞树
        Scanner scanner = new Scanner(System.in);
        System.out.println("RPC：少年请问，您喜欢的圣诞树是这样的吗？");
        System.out.println("圣诞树你想要几层？");
        int layers = scanner.nextInt();
        System.out.println("圣诞树每层要几颗星星（高度）:");
        int height =  scanner.nextInt();
        // 每一大坨的第一行的*空数量计算
        // 圣诞树顶打印
       int firstLineNum = 1;
       for(int k = 1 ; k <= layers; k ++) {
           // 每一坨里面的第一行的偏移量（空白）
           int p =  (height-1)+(height-2)*(layers-k);
           if(k == 1) {
               firstLineNum = 1;
               for(int i = 1 ; i <= height; i ++){
                   for(int j = 1; j <= p - i + 1;j ++ ) {
                       System.out.print(" ");
                   }
                   for(int j = 1;  j <= firstLineNum + i  - 1; j ++) {
                       System.out.print("* ");
                   }
                   System.out.println();
               }
           } else {
               firstLineNum = firstLineNum + height - 1  -  1;
               for(int i = 1; i <= height; i ++) {
                   for(int j = 1; j <= p - i + 1;j ++ ) {
                       System.out.print(" ");
                   }
                   // 打印星空
                   for(int j = 1; j <= firstLineNum + i -1  ; j ++) {
                       System.out.print("* ");
                   }
                   System.out.println();
               }
           }
       }
       // 树干打印 根据 最下面一层决定
        // 定义树干的宽度
        int width = (height) + (height - 2) * (layers -1);
//        System.out.println(width+"宽度");
        width = width -( width/4*2);
        for( int i = 1 ; i <= layers*height*3/2; i ++){
           // 计算最下面一层的数量
            // l = l + h - 1 - 1 + h -1
            // = l+2h-3
            for(int j = 1; j <=  (height) + (height - 2)* (layers -1) / 2 -3 ; j ++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
