package ylesanded;

/**
 * Created by kasutaja on 17.11.2016.
 */
public class Ex_7_2 {
    public static void main(String[] args) {
        System.out.printf("%.4f", squareRoot(10));
    }
    public static double squareRoot(double a) {
        double x = a / 2.0;
        for (double i = 1.0; i > 0.0001; i = i) {
            i = Math.abs(x - (x + a / x) / 2.0);
            x = (x + a / x) / 2.0;
        }
        return x;
    }
}

