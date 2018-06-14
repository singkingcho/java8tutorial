public class E6 {


    public static void main(String[] args) {
        // 统计重复的元素以及次数
        int[] arr = {1,1,3,4,5,1,44,5,444,6,6,5,1};
        int len = arr.length;

        boolean hasChecked;
        for(int i = 0 ; i < len ; i++) {
            boolean repeat = false;
            int count = 0;
            hasChecked = false;
            for(int k = 0; k < i ; k++ ) {
                if(arr[k] ==arr[i]){
                    hasChecked = true;
                }
            }
            if(hasChecked)
                continue;
            for(int j = i + 1; j <len; j ++ ) {
                if(arr[i] == arr[j]){
                    // 不去动数，只统计。
                    repeat = true;
                    count ++;
                }
            }
            if(repeat){
                System.out.println(arr[i] + "重复了" + count + "次");
            }
        }
    }
}
