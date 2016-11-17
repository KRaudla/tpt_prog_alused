package ylesanded;

import java.util.Random;
import java.util.Scanner;

/**
 Now that we have conditional statements, we can get back to the “Guess My Number” game from Exercise 4.
 You should already have a program that chooses a random number, prompts the user to guess it, and displays the difference between the guess and the chosen number.

 Adding a small amount of code at a time, and testing as you go, modify the program so it tells the user whether the guess is too high or too low, and then prompts the user for another guess.

 The program should continue until the user gets it right. Hint: Use two methods, and make one of them recursive.
 */

public class Ex_5_7 {

    public static void ask(){
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guessedNumber= userInput.nextInt();
        System.out.println("Your guess is: "+guessedNumber);
        tester(guessedNumber);
    }

    public static  void tester(int guessedNum){
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        if (number==guessedNum){
            System.out.println("bingo");
        }
        else if (number>guessedNum){
            System.out.println("Your guess is too low.");
            System.out.println("The number I was thinking of is: "+number);
            System.out.println("You were off by: "+Math.abs(guessedNum-number));
            System.out.println("Let´s try again.");
            ask();
        }
        else{
            System.out.println("Your guess is too high.");
            System.out.println("The number I was thinking of is: "+number);
            System.out.println("You were off by: "+Math.abs(guessedNum-number));
            System.out.println("Let´s try again.");
            ask();
        }
    }
    public static void main(String[] args) {
        ask();
    }
}
