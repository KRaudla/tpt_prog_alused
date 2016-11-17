package ylesanded;
import java.lang.Math;
/**
 * Draw a stack diagram that shows the state of the program in Section 5.8
 * after main invokes nLines with the parameter n == 4, just before the last invocation of nLines returns.
 */
public class Ex_5_4 {
    public static void checkFermat(int a, int b, int c, int n) {
        double x = Math.pow(a,n)+Math.pow(b,n);
        double y = Math.pow(c,n);
        if (n > 2&&x==y) {
            System.out.println("Holy smokes, Fermat was wrong!");
            System.out.println(n);
            return;
        }
        else{
            System.out.println("No, that doesn’t work.");
            checkFermat(a,b,c,n+1);
        }
    }
    public static void main(String[] args) {
        checkFermat(3,4,5,1);
    }
}
