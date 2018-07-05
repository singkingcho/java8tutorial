public class CodeBlockDemo {

    public String name;

    //static 静态的,
    /*
        关键字可以修饰如下成分:
            1 修饰字段
            2 修饰方法
            3 修饰代码块
     */



    public CodeBlockDemo() {
        System.out.println("我是无参构造器");
        this.name = "hehe";
    }


    {
        System.out.println("我是普通代码块我写在无参构造器的后面  ");
        // 这里可以使用this吗?
        this.name = "hahaha";
//        show();
    }


    public void show() {
        System.out.println("showtime");
    }
}
