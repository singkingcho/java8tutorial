import java.util.Scanner;

/**
 * 6.	编写一个Java程序，让用户从字母表中提供单个字符。根据用户输入，打印元音或辅音。如果用户输入不是字母（
 * 在a和z之间或A和Z之间），或者是长度大于1的字符串，则会输出错误消息。
 */
public class Exercisse6 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符");
        String str = scanner.next();

        //长度是否为1的问题解决
        //you方法叫做length()可以获取字符串的长度
        if(str.length() > 1) {
            System.out.println("您输入有误!");
            // 要进入length()里面，按住ctrl 点一下就进去了
        } else if(str.length() == 1) {
            // 是不是元音
            // 通过一个方法拿出第一个字符
            char c = str.charAt(0);
            // 确定它输入是不是a-z 包括大写
            // A 65 90
            if(c >= 65  && c <= 90 || c >= 97 && c <=  122){
                switch (c) {
                    // a e i o u
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println("元音");
                        break;
                    default:
                        System.out.println("辅音");
                }
            } else {
                System.out.println("您输入的不是字母");
            }

        }
    }
}
