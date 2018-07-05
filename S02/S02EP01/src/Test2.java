public class Test2 {


    public static void main(String[] args) {

//        执行一次就会调用一次构造器
        Person p = new Person();

//        它也要执行一次
        Person p2 = new Person();
        p.height = 18;
        p2.height = 33;
//        值不相同就理所当然
        // 成员变量，  实例变量（就属于某一个指定的实例，不属于任何其它的对象）

        System.out.println(p.height);
        System.out.println(p2.height);


        p = p2;

        // 内存回收机制，  垃圾回收
        // JVM回收机制就是Java的第四个特点
        // 我们程序员很少需要去考虑这个内存的问题
        // 第五个特点 健壮性--- 鲁棒性
        System.out.println(p.height);


    }
}
