import java.util.Arrays;

public class Demo2 {


    public static void main(String[] args) {
        // 保障一个整型数组奇数全部在偶数的后面
        int[] arr = {1,5,66,787,33,444,555,123123,333,666,4556,8990,321};
        int len = arr.length;


        for(int i = 0 ; i < len ;i++) {
            if(arr[i] % 2 == 1) {
                // 整体往前面移动
                // 循环整体往前面移动,既然最右边已经是一个奇数了，不要再去挤。
                int first = arr[i];
                for(int j = i; j < len - 1  ; j++){
                    arr[j] = arr[j + 1];
                }
                arr[len-1] = first;
                len--;
                i = -1;
//                continue;
            }


        }

        System.out.println(Arrays.toString(arr));

    }
}
