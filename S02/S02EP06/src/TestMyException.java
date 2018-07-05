import java.util.Scanner;

public class TestMyException {


    public static void main(String[] args) {

    }


    public void m1() throws UnHappyException{
        System.out.println("今天去钓鱼");
        Scanner scanner = new Scanner(System.in);
        System.out.println("今天钓到了吗？");
        if(scanner.next().equals("y")){
            System.out.println("今晚加鸡腿。");
        } else{

                throw new UnHappyException("气死我类");


        }
    }
}
