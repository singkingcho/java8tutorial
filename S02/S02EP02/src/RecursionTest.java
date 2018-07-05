public class RecursionTest {


    public static void main(String[] args) {
        int sum = sum(100);

        System.out.println(sum);

    }

    // 要有出口 , (递归如果比较复杂,深度太深的话,比较消耗性能)
    // 了解即可
    public static int sum(int n){
        if(n == 1){
            return n;
        }else {
            // 100 + 99 + 98 ++ 1
            // 100 + (sum(99))
            // n + (sum(n-1))
            return sum(n-1) +n;
        }
    }
}
