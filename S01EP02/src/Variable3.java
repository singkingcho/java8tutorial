/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 *   long
 *
 */
public class Variable3 {

    // 识别首字母即可
    public static void main(String[] args) {
        // 有范围限制，所以当超过一定长度的时候，不能再使用int
        // 发现换了long还是错误的，原因是对于LONg必须要加一个结束后缀
        // 可以写大写，也可以小写。 推荐使用大写
        long age = 10000000000L;
        // java7开始，做了一点人性化的改变
        long money = 323_213_122_321L;



    }


}
