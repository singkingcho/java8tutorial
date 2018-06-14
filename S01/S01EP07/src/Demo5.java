public class Demo5 {

    public static void main(String[] args) {

        // 排序太常见。
        // 找一圈找到最小值，丢到最后面
        int[] scores = {77,44,66,22,88,66,4,46,2,5,4,5,2,5,5,4};
        // 要求，成绩从高到低排序。
        // {88,77,66,44,22}
        // 10000份？

        // n个数，比较几轮？ n -1 轮
        // 每比较完一轮之后，就确定了一个数，
        // bubble sort
        int sum = 0;
        int swap = 0;
        for(int i = 0 ; i < scores.length - 1;i++) {
            for(int j = 0 ; j < scores.length - i - 1; j ++) {
                sum++;
                if(scores[j] < scores[j+1]){
                    swap++;
                    int tmp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = tmp;
                }
            }
        }

        for (int n:scores) {
            System.out.println(n);
        }
        // n个元素的数组排序，对于它的比较次数而言是多少？
        // 1 + 2 +....(n-1)  n*(n-1)/2
        // n2 平方成正比。
        // 2n 数组如果说比较大，比较次数就很恐怖
        // 1万个
        System.out.println("总共比较了" + sum);
        System.out.println("总共交换了" + swap);

    }
}
