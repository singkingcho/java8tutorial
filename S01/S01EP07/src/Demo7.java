public class Demo7 {


    // 二维数组 n 维数组
    public static void main(String[] args) {

        // 描述坐标，平面坐标
        int[][] position = new int[3][3];

        position[0][0] = 3;
        position[0][1] = 33;
        position[0][2] = 32;
        position[1][0] = 36;
        position[1][1] = 35;
        position[1][2] = 37;
        position[2][0] = 371;
        position[2][1] = 372;
        position[2][2] = 373;

        for(int[] a :position) {
            for(int b:a){
                System.out.println(b);
            }
        }



    }
}
