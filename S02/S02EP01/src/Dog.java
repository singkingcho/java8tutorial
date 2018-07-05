public class Dog {


    public String skin;





    public void eat() {
        System.out.println("吃狗粮。。。。。。。");
    }


    public boolean skip() {
        // 跳圈圈哟没有成功
        System.out.println("哮天犬开始跳投");
        // return 这个关键字主要有两个含义
        /*
            1 返回一个值，让调用方接收。
            2 结束方法的意思

            return 和 break区别
            整体生效    所在一层循环或者switch当中生效

         */
        return true;

    }


}
