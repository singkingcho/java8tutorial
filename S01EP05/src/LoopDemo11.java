public class LoopDemo11 {


    public static void main(String[] args) {

        // 打印 1 -122 数字对应的ascii
        char  c;
        for(int i = 1;  i <= 122; i++){
            // 得到i对应的ASCII码
            c = (char) i;
            System.out.println("" + i + "\t" + c);
        }

    }
}
