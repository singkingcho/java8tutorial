public class Demo3 {

    public static void main(String[] args) {
        int[] its = new int[3];
        int[] its2 = new int[4];
        // 数组的元素的赋值
        its[1] = 3;
        its = its2;
        System.out.println(its[1]);

    }
}
