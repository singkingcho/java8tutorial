public class Demo9 {

    public static void main(String[] args) {
        // 链子
        // 异常链，在你的程序里面，不同方法之间调用，整个调用的关系上面呢，可能出现了不同的异常
//        到底在哪处理
        try{
            show();
        } catch (Exception e){
            System.out.println("我在main方法处理");
        }
    }

    // Exception 分为两种  检查异常，运行时异常
    public static void show() {

        System.out.println(3/0);


    }
}
