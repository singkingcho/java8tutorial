public class E5 {


    public static void main(String[] args) {

    }


    /*
        从1一直乘到n
     */

    public long multiplication(long n){
        if(n <= 0) {
            return 0;
        }
        // int 阶乘，
        if(n == 1){
            return n;
        } else {
            return multiplication((n-1))*n;
        }
    }


}
