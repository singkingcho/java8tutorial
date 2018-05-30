/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 * 常量的使用
 */
public class ConstantDemo {


    public static void main(String[] args) {

        // 常量命名特殊点，使用全大写，如果有多个单词，使用下划线分割
        // 额外的关键字来描述
        // final最终版
        // final在数据类型前面
        // 对final修饰的变量只能赋值一次,防止你去修改
        final double  PI = 3.14;
//        PI = 3.14;

        System.out.println(PI);

    }
}
