public class Horse {


    public String skin;

    public int leg;


//    如果你要写别的构造器,请你一定要记得保留无参的
    public Horse(){
        System.out.println("我是无参数构造器");
    }


    // 有参,  参数写法是  type p1, type p2 .....
    // 分词  词法分析  skin2(形参)  占个坑,当个代表 具体是谁,还不知道.
    public Horse(String skin2, int leg2){
        // 得到类什么信息?
        /*
            1 类的成员变量对于成员方法而言是可见的.
            2 方法内可以修改其值
         */
        skin = skin2;
        leg = leg2;
    }

    // 这个构造器和上面的构造器是不一样的,
    // 名字冲突问题如何解决
    public Horse(int leg, String skin){
        // 我希望将外面传过来的leg赋值给里面的成员变量leg
        // 为了区分两腿,得搞个办法 JDK提供this 关键字
        // this代表的含义什么?
        // this在外面程序当中所代表的含义是 :  当前对象
        // 理解此时上下文环境.
        /*
        方法是谁的?
            成员方法
            一个对象拥有了独立的成员
            此时的this就是这个成员
            当前对象
         */
        // this.skin代表成员变量===外面写的 Horse h = new Horse();  h.skin
        // 同样的变量名称采取就近原则
         this.skin = skin;
         // 前者为对象的成员变量,后者为局部变量.
         this.leg = leg;
    }

    // 没有参数的情况下代码很死板,不灵活
    // 外部通信()
    public void eat(String food) {
        System.out.println("马儿吃" + food);
    }



}
















