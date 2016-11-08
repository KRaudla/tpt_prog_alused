package ylesanded;
import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * Write a method called printAmerican that takes the day, date, month and year as parameters and that displays them in American format.
 * Test your method by invoking it from main and passing appropriate arguments. The output should look something like this (except that the date might be different):
 Saturday, July 22, 2015
 * Once you have debugged printAmerican, write another method called printEuropean that displays the date in European format.
 */
public class DateFormat {
    public static void printAmerican(String day,String date,String month,String year) {
        System.out.println(day+", "+month+" "+date+", "+year);
    }
    public static void printEuropean(String date,String month,String year) {
        System.out.println(date+"."+month+"."+year);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner for user inputs
        System.out.println("Enter day: ");//ask something...
        String day = scanner.nextLine();
        System.out.println("Enter date: ");//ask something...
        String date = scanner.nextLine();
        System.out.println("Enter month: ");//ask something...
        String month = scanner.nextLine();
        System.out.println("Enter year: ");//ask something...
        String year = scanner.nextLine();
        printAmerican(day,date,month,year);
        //printEuropean(date,month,year);
    }
}
