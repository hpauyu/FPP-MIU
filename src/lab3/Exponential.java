package lab3;

public class Exponential {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
