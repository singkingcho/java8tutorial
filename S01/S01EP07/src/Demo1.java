public class Demo1 {

    public static void main(String[] args) {
        // 数组的声明与使用
        //int[]是固定语法，标明它是一个数组，然后数组当中的元素必须为int
        // classAges 变量名称--- 数组名称
        // new int[29];
        // new 的含义是告诉JVM，我要动态的分配内存
        // [29]的含义就是代表数组的长度为29
        // new int 和前面对应起来


        int[] classAges = new int[29];

        // 1 数组有长度
        // 数组有属性可以来验证 ---
        // 凡是通过某个引用，变量名称.后面跟上一个名称并且不带括号的叫做属性
        // 带了括号的叫做方法
        System.out.println(classAges.length);

        // 2 数组里面有元素，如何去访问呢？
        // 数组访问元素是通过如下语法
        // arrayNum[index]   通过下标的索引去找出数组元素当中的值？
        // 由于数组的下标是根据元素的偏移值来定的，所以它的第一个元素的偏移是0，所以才是从0开始。
        // 一个数组的最大有效下标为多少？  length - 1

        // 昨天学习了循环，
        // 基本数据类型，JVM不会帮我们初始化，
        int a;
        // 而数组会帮我们初始化。 new 操作符起的作用，
        // 帮助我们讲数组当中的元素统一进行初始化
        // int 0
        // double 0.0
        // char


//        for(int i = 0 ; i < classAges.length; i++) {
//            System.out.println(classAges[i]);
//        }

    }

}
