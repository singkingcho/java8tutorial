public class TestHorse {


    public static void main(String[] args) {

        //
//        Horse horse = new Horse();
        // 两个构造器名字是一样的,然后仅仅是参数不一样, 构造器的重载.
        // 构造器的名称是一样的,但是参数列表不一样
        // 不一样的含义是,位置上参数类型无法一一对应
        // 数量上面不同
        // 每个位置上对应起来的type 有区别
        /*
         Stirng  , int
         String    , int,int

         赤兔 也是实参
         */
        Horse horse = new Horse("赤兔",3);
        System.out.println(horse.skin);

        // JDK会为所有的类提供一个默认的无参构造器,(必须在没有显式的声明过其他构造器的前提下)
        Horse h = new Horse();
        h.eat("猪肉");
        // 这里的饺子叫做 --- 实参
        h.eat("饺子");
        // 在方法的声明处括号内存的参数名称为形参
        // 在具体调用处使用的值则为实参




    }
}
