/**
 * @Author 邱道长
 * @Date 2018/5/30
 * @Description
 *   研究变量的使用
 *   idea有一个万能按键=== alt + enter
 *
 */
public class Variable {

    // 识别首字母即可
    public static void main(String[] args) {
        // 1 如何声明一个变量 ，有什么数据类型，强数据类型保证
        // 格式： 数据类型 变量名;
        // 2 变量命名的问题
        /*
            命名规则：
                     开头必须字母或者下划线开头，就用字母（要小写）
                     除了开头之外，还可以有数字，还可以用美元符号也行
                     2 4 数字里面用这两个
                     老外偷懒
                     2  4
                     To for
                     0
                     正式写代码不要再出现其它的数字
                     不是必须的，但是非常建议使用的，驼峰命名规则。
                     // 第一个单词的首字母小写，其后的每个单词的首字母都要大写。
                     babyAge
                     baby_age// 个人不建议

                     中文，可以使用，不要使用，
                     代码混淆，
         */
        // int babyAge;
        // 如果要使用变量，必须先初始化变量== 赋值（第一次赋值）

        // 先声明 ， 后赋值，不是在一起完成的
        int babyAge = 33;
        babyAge = 88;
        // 变量，能变的量。
        // sout 快捷输入 System.out.println();

        System.out.println(babyAge);

    }


}
