# 选择结构之switch

**复习预习提问**

- 用于判断的关键字是什么？
- else的隐藏含义是什么？
- switch适用场景是什么？



**今日任务**

- 掌握switch的用法
- 比较if与switch
- 重难点梳理
- 综合运用前面所学进行训练



## if选择的特点

判断场景就需要使用if选择结构。

- 顺序结构
- 选择结构









## 为何引入switch

为何要引入switch： 对于if里面一些等值判断，语言作者推出一个switch的结构来简化代码。

它可以完全使用if来代替。



### 以前使用if来解决如下

```java

        // 【需求】 通过用户输入1-7（整数） 然后输出是星期几

        Scanner scanner = new Scanner(System.in);

        // 接收输入
        System.out.println("请输入1-7的整数：");
        int num = scanner.nextInt();
        // 数字比较使用 ==   字符串要使用 equals
        if(num == 1){
            System.out.println("今天星期一");
        } else if (num == 2) {
            System.out.println("今天星期二");
        } else if (num == 3) {
            System.out.println("今天星期三");
        } else if (num == 4) {
            System.out.println("今天星期四");
        } else if (num == 5) {
            System.out.println("今天星期五");
        } else if (num == 6) {
            System.out.println("今天星期六");
        }  else if (num == 7) {
            System.out.println("今天星期日");
        } else {
            System.out.println("你星期有问题");
        }

```



### 现在使用switch来解决如下:

```java
import java.util.Scanner;

public class SwitchDemo2 {


    public static void main(String[] args) {
        // 使用switch解决
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字");
        int num = scanner.nextInt();

        // case后跟上固定值,JDK7前只可以使用整数,7以后可以支持String
        switch(num) {
            case 1:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期一");
                // 当break没有写, 如果没有break掉,那么它会一直执行到下一个break
//                break;
            case 2:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期二");
//                break;

            case 3:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期三");
                break;
            case 4:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期四");
                break;
            case 5:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期五");
                break;

            case 6:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期六");
                break;
            case 7:
                // break, 打断,打断这个代码的执行,跳出switch结构
                System.out.println("星期天");
                break;
                // 就是当其它的都不满足的话,会跑到这里来执行
            // default 一般放在最后面
            default:
                System.out.println("天堂里面没有星期");
                break;
                

        }


        System.out.println("switch结束了");
    }
}

```



## 如何调试程序

看看瞧瞧

借助debug方式(bug问题,虫子)



- 打断点
- 以debug模式启动
- 观察分析
- 分析结论,纠正错误



单步执行 step over 



## 重难点梳理 

## 实战训练

## JDK中文API在线查看

http://www.matools.com/manual/1000