public class OverLoad {



    // 同样都是要秀,但方式不一样,我们不想重复命名
    // Java方法同名可以(参数列表要不一致) 这种方法就合起来称之为方法的重载

    public void show() {
        System.out.println("我眼单人推火车");
    }

    // 方法的重载和返回值有什么关系么有?
    public void show(String msg) {
        System.out.println("我要秀"+msg);
    }

    // 证明方法的重载和我们返回值类型无关.
//    public int show(){
//        return 0;
//    }
}
