public class StaticBlockDemoTest {


    public static void main(String[] args) {
        // 变量名习惯使用每个单词的首字母
        /*
            通过实验证明:
            1  static代码优先于构造器执行
            2   调用多次构造器的时候,static对应的代码块只执行了一次

            3 static代码块加载的原则
                跟随一个类加载器加载而执行,并且对于一个类而言,它只会加载一次.
                (属于这个类,不属于某一个实例)



         */
        StaticBlockDemo sbd = new StaticBlockDemo();
        StaticBlockDemo sbd2 = new StaticBlockDemo();


    }
}
