import java.util.Arrays;

/**
 * 去除一个数组当中的重复元素
 *
 */
public class E1 {


    public static void main(String[] args) {

        int[] arr = {1,3,3,3,5,6,7,8,9,5};

        int uniqueLen = arr.length;

        for(int i = 0 ; i < arr.length ; i ++) {
            for(int j = i+1; j < uniqueLen; j ++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[uniqueLen-1];
                    uniqueLen--;
                    j--;
                }
            }
        }


        int[] arrNew = new int[uniqueLen];
        for(int i = 0 ; i < uniqueLen; i ++) {
            arrNew[i] = arr[i];
        }

        System.out.println(Arrays.toString(arrNew));

    }
}
