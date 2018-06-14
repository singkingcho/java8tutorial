public class LoopDemo12 {


    public static void main(String[] args) {
        // 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？

        double sum = 0.0;
        double len = 100;
        for(int i = 1; i <= 3 ; i ++){
            // 每次的折返具体
            // 两次循环
            // 从第一落地之后,的每一次升起和降落都是前面一次的一半
            // 分析循环规律
            if(i > 2) {
                len /= 2;
            }
            sum += len;
        }
        System.out.println(sum);
        System.out.println("第十次反弹高度为:"+len/2);

    }
}
