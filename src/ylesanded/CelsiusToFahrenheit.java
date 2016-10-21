package ylesanded;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by kasutaja on 21.10.2016.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Insert the value of Celsius: ");
        double Celsius = UserInput.nextDouble();
        double Fahrenheit = ((Celsius*9)/5)+32;
        System.out.printf("Fahrenheit value is: %.1f",Fahrenheit);

    }


}
