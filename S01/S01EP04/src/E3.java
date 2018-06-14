import java.util.Scanner;

public class E3 {


    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 7, 9, 22, 677, 88};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int pos = -1;
        while(start <= end) {
            mid = start   +  (end-start) / 2;

            // 满足则证明是在前半区
            if(start == end){
                pos = start;
                break;
            }
            if(num < arr[mid]){
                end = mid -1 ;
            } else if( num > arr[mid]){
                start = mid +1 ;
            } else {
                pos = end;
                break;
            }


        }

        System.out.println(pos);
    }


}