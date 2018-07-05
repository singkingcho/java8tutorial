package cn.baby;

public class Bar extends  Foo {


    public static int love = 66;

    private String name;

    {
        System.out.println("Bar 的代码块");
    }

    static {
        System.out.println("Bar 的静态代码块");
    }


    public Bar(){
        // 子类的构造器当中尝试调用父类构造器
        // 假如，没有写下面这一行，那么JDK默认会加上这一行。正是因为有这行所以父类的构造器的代码会执行
        // 必须在第一行
        super();
        System.out.println("Bar 的无参构造器");

    }

    public Bar( double height,String name) {
        // 调用父类的有参构造器
        // 可以调用父类的构造器，通过super传参即可，并且一样只能出现在第一行
        super(height);
        System.out.println("Bar的有参构造器");
        setHeight(height);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
