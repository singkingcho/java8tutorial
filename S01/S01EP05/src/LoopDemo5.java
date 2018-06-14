public class LoopDemo5 {


    public static void main(String[] args) {

        // 这里面的数字以8或者2结尾不统计
        // 将这个数字对10去模为2 或者 8 那么将不统计, 怎么让它不统计
        int i = 1;
        int sum = 0 ;
        while ( i <= 100) {

            // 方式三
            if(!(i % 10 == 2 | i % 10 == 8)) {
                sum += i;
            }
            i++;


            // 方式二
/*            if(i % 10 == 2 | i % 10 == 8) {
            } else {
                sum += i;
            }
            i++;*/

            // 方式一
/*            if(i % 10 == 2 | i % 10 == 8) {
                i++;
            } else {
                sum += i;
                i++;
            }*/


        }

        System.out.println(sum);
    }
}
