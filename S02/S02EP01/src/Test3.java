public class Test3 {


    public static void main(String[] args) {

        Dog dog = new Dog();
        // 因为有返回值才可以对变量赋值
        boolean b = dog.skip();

        System.out.println(b?"成功":"失败");

    }
}
