public class CalculatorTest {

    public static void main(String[] args) {
        double a = 3.3;
        double b = 5.7;
        double devideResult = Calculators.devide(a,b);
        System.out.println(devideResult);
        System.out.println(a);
        System.out.println(b);

        // 因为有返回值所以才发生类改变
        a = Calculators.change(a);

        System.out.println(a);
    }
}
