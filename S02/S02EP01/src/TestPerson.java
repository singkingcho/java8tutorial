public class TestPerson {


    public static void main(String[] args) {
        // 用户名和密码
        // 接触引用数据类型
        // int double
        // 一旦定义过class的这种数据类型都属于引用数据类型
        // 是因为Java提供一种便利的赋值方式
        String str = "hahaha";
        // 类比


        // 这一行是干嘛，声明一个变量名字叫做p
        // 它的数据类型是 Person
        Person p;

        // 变量赋值
        // new 操作符，它用于创建一个对象。
        // 什么是对象呢？
//        抽象与具体
//                类是对象的模板
//        对象是类的实例

        // new后面的 Person() 这是什么意思？
        // 这里使用类的构造器。
        // 无参数的构造器  在Java里面默认会有一个无参构造器
//        类名() 构造器调用  配合前面的new 操作符
        p = new Person();

        // 对象都是通过  . 操作符来进行完成
        // p.属性 p.方法   调用的含义
//        p.height = 188;
//        p.height = 333;

        /*
            成员变量                         VS             局部变量
            声明了可以不赋值 （不是所有）                   必须要手动初始化才可以
            虚拟机会自动补上这个初始值
         */
        System.out.println(p.height);
        System.out.println(p.age);
        System.out.println(p.username);
        p.fight();
//        System.out.println();




    }
}
