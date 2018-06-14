/**
 * @Author 邱道长
 * @Date 2018/5/31
 * @Description
 */
public class Exercise14 {


    public static void main(String[] args) {
        // 1 生成三个随机数
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        // 2 判断有几个小于0.2
        int count = 0;
        if(random1 < 0.2)
            count++;
        if(random2 < 0.2)
            count++;
        if(random3< 0.2)
            count++;

        if(count == 3)
            System.out.println("All is tiny");


        if(count == 1)
            System.out.println("Only one is tiny");
    }


}
