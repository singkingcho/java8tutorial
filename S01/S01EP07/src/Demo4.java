public class Demo4 {

    public static void main(String[] args) {
        // 数组声明的方式说明

        // 【一】 声明和赋值一起完成并且指定长度（赋值由JVM来完成）
//        int[] nums = new int[3];

        // 【二】 声明赋同时完毕，然后对里面的元素也手工赋值了
        // java规定了当适用{}进行赋值的时候不能再到前面的[]里面加上长度
//        int[] nums = new int[]{1,2,3};
        // 【三】 直接省略了new int[] 这一套操作
//        int[] nums = {1,3,4};
//        System.out.println(nums.length);
        // 【四】以前的语言写法，也可以，但是java不推荐使用。
//        int nums[] = {1,4};

        // 【五】
//        int[] nums;
//        nums = new int[3];

        /*
         【错误的写法】
            int[] nums = new int[3];
        // 这种写法不行
        nums = {1,3,4,5};
         */
        int[] nums = new int[3];
        int[] nums2 = {1,3,4,5};
        nums = nums2;

        System.out.println(nums[2]);

        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 33
            数组下标越界
         */
        System.out.println(nums[33]);

    }

}
