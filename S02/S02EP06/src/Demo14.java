public class Demo14 {


    public static void main(String[] args) {

        method();
    }


    public static void method(){
        try{
            //
            System.out.println(3/0);
        } catch (ArithmeticException e){
            // 打印站的链子
            // 打印全类名： 异常信息的描述， 栈的追踪信息，也就是方法调用的逆过程打印
//            e.printStackTrace();
            // 一个对象的打印，其实就是打印的toString方法
//            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
