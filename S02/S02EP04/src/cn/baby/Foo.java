package cn.baby;

// 在Java里面，一个类如果没有显式地去extends某个类，那么将默认extends Object
public class Foo {


    // 常量
    public static final int age = 88;

    private double height;

    private String lastName;

    private String girlFriend;





    {
        System.out.println("Foo 的代码块");
    }

    static {
        System.out.println("Foo 的静态代码块");
        System.out.println("age:" +age);
    }

    public Foo(){
        System.out.println("Foo 的无参构造器");
    }

    public Foo(double height) {
        System.out.println("Foo的有参构造器");
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
