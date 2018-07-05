public class StaticBlockDemo {


    // 静态代码块的研究


    public StaticBlockDemo() {
        System.out.println("我是无参构造器");
    }

    static{
        System.out.println("我是静态代码块");
    }

    static{
        System.out.println("我是静静2");
    }

}
