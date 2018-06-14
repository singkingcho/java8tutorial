import java.util.Arrays;

public class E2 {

    public static void main(String[] args) {

        int[] arr = {22,31,47,33,22,66,87,35,88};

        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            // 从左边开始 目的是为了找出第一个奇数
            while (arr[left] % 2 == 0 && left < right){
                left ++ ;
            }
            // 从右边开始寻找一个偶数
            while(arr[right] % 2 == 1 && left < right){
                right--;
            }
            if(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left ++;
                right--;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
