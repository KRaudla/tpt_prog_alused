package ylesanded;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kasutaja on 21.10.2016.
 */

public class GuessStarter {
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guessedNumber= userInput.nextInt();
        System.out.println("Your guess is: "+guessedNumber);
//generating the random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: "+number);
        System.out.print("You were off by: "+Math.abs(guessedNumber-number));
    }

}
