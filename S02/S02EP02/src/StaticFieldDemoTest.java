public class StaticFieldDemoTest {


    public static void main(String[] args) {
        // 用static修饰的field字段,可以通过类名直接调用
        // 类变量(static修饰的字段) 为全对象共有
        System.out.println(StaticFieldDemo.age);
        // null的作用仅仅能用来比较 == != 不能调用任何的方法  也不能使用数组的[]
        System.out.println(StaticFieldDemo.ages);
        StaticFieldDemo.age = 33;

        StaticFieldDemo sfd = new StaticFieldDemo();
        System.out.println(sfd.age);


    }

    
}
