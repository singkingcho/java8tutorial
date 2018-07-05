public class Demo6 {

    public static void main(String[] args) {
        // finally 程序无论如何都会执行的代码（主动退出虚拟机）

        // 不能单独存在  try 和finally 写可以，没有catch是可以的
        try{
            System.out.println("我是try");
            System.out.println(3/0);
        } catch (ArithmeticException e){
            System.out.println("数学异常");
        } finally {
            // IO 流关闭， 资源  水龙头
            System.out.println("水龙头关闭");
        }

        // 由于某些原因，有写代码未必能够保障执行到，而如果有的代码它必须要执行的话。这些代码就适合放在finally
        System.out.println("我是异常后面的哥们");
    }

}
