public class Human {

    //访问修饰符
    /*
        在Java里面控制我们代码访问权限的关键字
        封装两层含义：
            1 把应该在一起的部分组合成为一个有机的整体
            2 保障安全
                public  公共的
                private 私有的（只有在本类当中可以自由访问），出了这个类就不可见


        类成员：
            1 成员变量      咔嚓
            2 成员方法      只有它可以动手脚
            3 类变量        卡擦
            4 类方法   （） 卡擦
            5 代码块（静态/非静态） （可以吗？代码块能传递参数吗？） 卡擦

     */



    // CM
    private double height = 188;

    private int age = 18;



    // getter setter方法
    // 保留一个火种可以去尝试得到。

    // 别人告诉我，我怎么做setXXX

    // 别人问我，我给个答复 getXXX

    //
    public double getHeight(){
        return  height;
    }

    public boolean setHeight(double height){
        // 自行控制逻辑
        if(height < 10){
            System.out.println("你这个是个假身高，不合符人类基本认识。");
            return false;
        }
        this.height = height;
        return true;
    }

}
