public class Demo5 {


    public static void main(String[] args) {

        try{
            int[] nums = new int[5];
            nums[1] = 33;
            System.out.println("33之后");
            try{
                int a =  3 / 0;
            } catch (ArithmeticException e){
                System.out.println("数学异常");
            }


        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界，请注意");
        }
    }
}
