import java.util.Scanner;

public class Demo10 {


    public static void main(String[] args) {

        System.out.println("请输入二维数组外层的个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][];

        for(int i = 0 ; i < n; i ++){
            System.out.println("请问您第" + (i+1) + "外层数组当需要几个元素？");
            int m = scanner.nextInt();
            nums[i] = new int[m];
        }

        // 容量确定之后，我再通过随机来生成

        for(int i = 0 ; i < nums.length ; i ++) {
            for(int j = 0; j < nums[i].length; j ++){
                nums[i][j] = ( int)(Math.random() * 50 ) + 1;
            }
        }

        for (int[] ns:nums){
            for (int s:ns){
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}
