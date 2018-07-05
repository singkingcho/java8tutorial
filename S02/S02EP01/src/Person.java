/**
 * 人    类
 */
public class Person {

    // 我们平时如何描述范冰冰的？

    // 描述类身高，年龄

    // 干了曹操一顿，做了什么事 （能力，think）。

    // 分为两类： 静态  动态。
    // 两种语法来对应这种特点
    // 属性---静态
//    方法---动态
//    成员数据类型描述我们的这些动静特点

    // 写的代码有没有在main方法里面？

    // 这种没有写在方法里面，在方法外部，类的内部独立声明的变量就称之为成员变量
//    以前写在main方法里面的变量都属于局部变量

    /**
     * 文档注释
     *
     */
    // 1 成员变量  2 字段  3 域 4 属性
    /**
     * 单位CM（厘米）
     */
    public double height;

   public  int age;

   public String username;


   public String password;


   // 任何一个实例的初始化都必须调用构造器（）
    // 可以不止一个，无论是哪个最终都会一个要执行。
   public    Person (){
       System.out.println("我构造构造");
   }



    /*

        语法
        访问修饰符  返回值类型  方法名(参数列表) {


            //如果有需要，需要
            return 语句
        }
        void:不需要返回值。 不写

        public是公开的，
        写类的时候写过
        同一个class文件里面只能存在一个public的class
        公开就意味着谁都能搞


        成员方法
     */
    public void fight() {
        System.out.println("诸葛村夫你是真能打！");
    }





}
