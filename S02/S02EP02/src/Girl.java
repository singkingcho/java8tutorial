public class Girl {


    public String name;

    public int age;

    public double height;

    // 分裂物
    // Girl是一个名字 标志符号
    // 没有返回值类型和不需要返回值的void是两码事
    // null ""
    public Girl(){

    }

    // 在一个构造器里可不可以调用另外一个构造器, 调用是可以的但是有个前提
    // 出现了this的调用,而这个调用必须出现最前面
    // this一定要出现在前面
    // 在构造方法里面一样可以调用普通方法

    //   this永远指代当前上下文的拥有者
    public Girl(String name,double height){
        this(name);
    }

    public Girl(String name){
        this.name = name;

    }

    public Girl(double height){
        this.height = height;

    }

    public void setName(String name){
        this.name = name;
        // 省略this 可见
        setAge(3);
    }

    public void setAge(int age){
        // 可以这么写
        this.setName("saaa");
    }
}
