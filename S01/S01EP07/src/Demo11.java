import java.util.Scanner;

public class Demo11 {


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

        // 本题排序，只要求，二维数组内部排序即可。
        /*
        i 控制数组内部的数组个数
        j 控制数组内部的数组的比较轮数
        k 控制数组里面数组的元素的值的下标
        i k 结合起来描述二维数组的具体元素（）
         */
        for(int i = 0 ; i < nums.length  ; i ++) {
            for (int j = 0 ; j < nums[i].length -1 ; j ++) {
                //num[0] = {1,3,2};
                for(int k = 0 ; k < nums[i].length - j -1; k ++){
                    if(nums[i][k] > nums[i][k+1]) {
                        //[0][0]  [0][1]
                        int tmp = nums[i][k];
                         nums[i][k] = nums[i][k+1];
                         nums[i][k+1] = tmp;
                    }
                }
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
