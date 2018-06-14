public class Demo6 {

    public static void main(String[] args) {

        int[] scores = {77,44,66,22,88,66,4,46,2,5,88,5,3231,325,5,4};
        // 排序
        // 每次去找一个最大或者最小值
        int swap = 0;
        for(int i = 0 ; i < scores.length ; i++) {
            int min = scores[0];
            int pos = 0;
            for(int j = 1; j < scores.length - i; j ++) {
                // 这里交换了
                if(min > scores[j]){
                    min = scores[j];
                    pos = j;
                }
            }
            // j位置的值才是最小的
            // j 位置和最后面的那个值换位置
            int tmp  = scores[pos];
            scores[pos] = scores[scores.length - i -1];
            scores[scores.length - i -1] = tmp;
            // 交换次数
            swap ++;
        }
        // 增强型for循环，仅仅用于演示查看，不要在这个循环里面尝试去修改循环的这个数组的元素值。
        // 数据类型 变量名:要遍历的那个变量
        for(int n:scores) {
            System.out.println(n);
        }
        System.out.println("交换次数为：" + swap);
    }
}
