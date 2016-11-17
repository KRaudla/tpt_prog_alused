package ylesanded;

/**
 * Write a recursive method named oddSum that takes a positive odd integer n and returns the sum of odd integers from 1 to n. Start with a base case, and use temporary variables to debug your solution. You might find it helpful to print the value of n each time oddSum is invoked.
 */
public class Ex_6_7 {

    public static int oddSum(int n) {
        if ((n - 1) % 2 != 1) {
            if (n == 1) {
                return n;
            } else {
                return n + oddSum(n - 2);
            }
        } else {
            return oddSum(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(oddSum(7));

    }
}
