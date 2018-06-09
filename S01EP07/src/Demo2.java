public class Demo2 {

    public static void main(String[] args) {
        int[] ints = new int[3];
        byte[] bts = new byte[3];
        char[]  cs = new char[3];
        double[] ds = new double[3];
        boolean[] bs = new boolean[3];

        System.out.println(ints[0]);
        System.out.println(bts[0]);
        // 有东西，肉眼看不见。
        System.out.println(cs[0]);
        System.out.println(ds[0]);
        System.out.println(bs[0]);

        String[] strs = new String[3];
        // null 值，对于非基本数据类型元素的初始化，将会适用null
        System.out.println(strs[0]);
    }
}
