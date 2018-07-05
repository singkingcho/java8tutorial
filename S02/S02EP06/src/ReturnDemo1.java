public class ReturnDemo1 {

    public static void main(String[] args) {
        int num = m1();
        System.out.println(num);
    }


    public static int m1(){
        int num = 0;
        try{
            int a = 3 / 0;
            num = 3;
            return num;
        } catch (Exception e){
            num++;
            return num;
        } finally {
            // 当北京遇上西雅图， 当return遇上finally
            num++;
            return num;
        }
    }



}
