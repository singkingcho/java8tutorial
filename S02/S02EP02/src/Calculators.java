public class Calculators {



    // staitc方法当做工具方法 (工具类)
    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiPly(double a, double b) {
        return a * b;
    }

    public static double devide(double a, double b) {
        a += 1;
        b += 1;

        return a / b;
    }

    public static double change(double a) {
        return a + 2;
    }
}
