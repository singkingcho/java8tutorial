package cn.baby;

public class Test {


    public static void main(String[] args) {
//        Bar b  = new Bar();
//        Bar b2  = new Bar();
        Bar b = new Bar(333.3,"李四");
        // Java里面只支持单继承
        System.out.println(b.hashCode());
        //cn.baby.Bar@1540e19d
        // 当我们去打印一个对象的时候，默认调用的其实是toString()方法
        System.out.println(b);
        String s = "haha";
        String s2 = new String("hehe");
        System.out.println(s2);


//        System.out.println(b.age);

//        System.out.println(Foo.age);
//        System.out.println(Bar.age);
    }
}
