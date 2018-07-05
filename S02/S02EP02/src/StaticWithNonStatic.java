public class StaticWithNonStatic {


    /*
        1 在静态代码块里面能否调用非静态方法,字段
            不能使用成员变量
            能否使用this(也不能用)
            普通方法也不能
        2 静态方法里面也不能调用普通的字段和this
            普通方法也不能



        3 普通方法里面可以调用静态方法吗?
            可以



         为什么?

         // 静态的由于不要求有实例,通过类名可以直接调用
         // 而普通方法只能通过对象调用
         //

     */


    public String name;

//    static{
//        // static里面可以调用this吗?
//        this.name = "啊啊啊";
//    }

    public static void m1(){
//        this.name = "aa";
//        m2();
    }

    public void m2() {
        m1();
    }












}

















