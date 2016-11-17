package ylesanded;

/**
 * Draw a stack diagram showing the state of the program just before the last invocation of prod completes.
 What is the output of this program? (Try to answer this question on paper first, then run the code to check your answer.)
 Explain in a few words what prod does (without getting into the details of how it works).
 It ś a factorial

 Rewrite prod without the temporary variables recurse and result. Hint: You only need one line for the else branch.
 */
public class Ex_6_6 {

    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return n*prod(m, n - 1);
            //int recurse = prod(m, n - 1);
            //int result = n * recurse;
            //return result;
        }
    }
}
