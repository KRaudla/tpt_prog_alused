package ylesanded;
/**
 *Write a method named isDivisible that takes two integers,
 *n and m, and that returns true if n is divisible by m, and false otherwise.
 */
public class Ex_6_2 {

    public static boolean isDivisable(int n, int m){
        if (n%m==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isDivisable(5,6));
    }
}
