public class Parameter2Test {

    public static void main(String[] args) {
//        Girl g = new Girl();
//        g.name = "王菲";
//        g.age = 52;
//        Parameter2.change(g);
//        System.out.println(g.name);
//        Parameter2.modify(g);
//        System.out.println(g.name);

        Girl g = new Girl();
        g.name = "菲菲";
        // 返回值有,不接收也没用
        g = Parameter2.change2(g);
        System.out.println(g);
    }
}


