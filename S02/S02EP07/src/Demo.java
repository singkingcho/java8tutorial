public class Demo {

    public static void main(String[] args) {

        int num = m1();
        System.out.println(num + "===");


    }

    public static int m1(){
        try{
            System.out.println(1);
            System.out.println(19/0);
            return 1;
        } catch (ArithmeticException e){
            System.out.println(2);
            System.exit(1);
            return 2;
        } finally {
            System.out.println("叁");
            return 3;

        }
    }
}
