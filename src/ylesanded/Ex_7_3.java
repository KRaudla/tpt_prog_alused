package ylesanded;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by kasutaja on 17.11.2016.
 */
public class Ex_7_3 {

    public static void main(String[] args) {
        test(2.0,3);
    }
    public static void test(double x,int n){
        double sum = 1;
        while (n!=0){
            n--;
            sum =sum*x;
        }
        System.out.println(sum);
    }
}