public class Demo10 {

    public static void main(String[] args) {
        // 链子
        // 异常链，在你的程序里面，不同方法之间调用，整个调用的关系上面呢，可能出现了不同的异常
//        到底在哪处理
        // 像这种情况，哪一层都没有处理，最后就把问题交给了虚拟机
        show();

    }

    // Exception 分为两种  检查异常，运行时异常
    public static void show() {

        System.out.println(3/0);


    }
}
