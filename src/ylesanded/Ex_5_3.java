package ylesanded;

/**
 * Draw a stack diagram that shows the state of the program in Section 5.8
 * after main invokes nLines with the parameter n == 4, just before the last invocation of nLines returns.
 */
public class Ex_5_3 {
    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }
    public static void main(String[] args) {
        nLines(4);
    }
}
//the end of invoke the value of n is 1