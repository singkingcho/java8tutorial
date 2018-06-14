import java.util.Arrays;

public class Demo3 {


    public static void main(String[] args) {
        // 保障一个整型数组奇数全部在偶数的后面
        int[] arr = {1,5,66,787,33,444,532,339,338,555,123123,333,666,4556,8990,321,8990};
        int len = arr.length;
        // 最左边的奇数·
        int left = 0;
        // 最右边的偶
        int right = arr.length - 1;
        while(left < right) {
            while(arr[left] % 2 == 0 ){
                left++;
            }
            while(arr[right] % 2 == 1){
                right--;
            }
            // 如果不加，反而会出现倒过来置换问题出现
            // 38 39
            // 39 38
            if(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        // 严谨
        System.out.println(Arrays.toString(arr));
    }
}
