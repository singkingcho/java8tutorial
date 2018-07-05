public class StaticMethodDemo {


    static{
        System.out.println("我加载类类  我是惊天代码块");
    }


    public StaticMethodDemo(){
        System.out.println("==================");
    }

    public static int add(int i , int j){
        return i+j;
    }


}
