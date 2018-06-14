public class Demo1 {


    public static void main(String[] args) {
        // 需求，数组去除重复元素

        //  1 思路没有

        //  2 思路有 代码体现不了

        int[] arr = {1,3,5,3,1,1,1,1,1,1,666,55,4,44,5,5,5,6,6,77,33,99,99,12321321};


        // 1 描述独一唯一的元素的长度（个数）。
        int uniqueLen = arr.length;

        for(int i = 0 ; i < uniqueLen ; i ++) {
            // 内部循环比较
            for(int j = 1+i; j < uniqueLen; j++) {
                if(arr[i] == arr[j]){
                    // 证明这个数重复了
                    int tmp = arr[j];
                    arr[j] = arr[uniqueLen-1];
                    arr[uniqueLen-1] = tmp;
                    // 换到了最后面，然后它的唯一长度减少了
                    uniqueLen--;
                    // 能保障换过来的元素依旧不重复？
                    // 出现了情况就是最后元素只剩下一个的终极原因就是因为自己和自己在比。
                    j--;
                }
            }

        }

//        System.out.println(uniqueLen);
        int[] arrNew = new int[uniqueLen];

        for(int i = 0 ; i < uniqueLen ; i++) {
            arrNew[i] = arr[i];

        }

//        System.out.println(uniqueLen);
        for(int n:arrNew) {
            System.out.println(n);
        }


    }
}
