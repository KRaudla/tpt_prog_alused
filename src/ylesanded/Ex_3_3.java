package ylesanded;

import java.util.Scanner;

/**
 * Created by kasutaja on 21.10.2016.
 */
public class Ex_3_3 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Insert the number of seconds: ");
        int inputSeconds = UserInput.nextInt();
        int hours = inputSeconds/3600;
        int leftSeconds= inputSeconds%3600;
        int minutes = leftSeconds/60;
        int  seconds = leftSeconds%60;
        System.out.println(inputSeconds+" seconds= "+hours + " hour "+minutes+" minutes "+ seconds+ " seconds");
    }
}
