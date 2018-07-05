import java.util.InputMismatchException;

public class File {


    /**
     * 文件路径
     */
    private String path;

    public File(){

    }

    /**
     * 文件有可能不存在
     * throws是声明抛出一个异常，这个异常不一定会发生的。
     *  throws可以抛出多个异常，使用逗号分割
     *  throw VS throws
     *  throw是代码当中主动抛出异常，是一个动作。
     *  throws是静态的，仅仅在于声明处
     *
     * @param path
     */
    public File(String path) throws ArithmeticException,InputMismatchException,NullPointerException {
        this.path = path;
        path.equals("aaa");
    }


}




































