import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {


    public static void main(String[] args) {
        int[] arr = {1,3,5,5,6};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要插入的整数：");
        int num = scanner.nextInt();
        int start = 0;
        int end = arr.length -1;
        int pos = -1;
        while(start <  end) {
            int mid =start + (end-start)/2;
            if(end - start == 1) {
                // 邻居情况
                if(num >  arr[start] && num <= arr[end]){
                    pos = end;
                } else if (num <= arr[start] ){
                    pos = start;
                } else   {
                    pos = end + 1;
                }
                break;
            }

            if(num > arr[mid]){
                // 在右边
                start = mid ;

            } else if(num < arr[mid]){
                // 0 2 mid = 1
                //start =
                // end = 1;
                end = mid;
            } else {
                pos = mid;
                break;
            }

        }


        System.out.println(pos);


        // 已经的pos
        int[] arrNew = new int[arr.length + 1];

        for(int i = 0; i < arrNew.length ; i ++) {
            if(i < pos){
                arrNew[i] = arr[i];
            } else if(i == pos) {
                arrNew[i] = num;
            } else {
                arrNew[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
