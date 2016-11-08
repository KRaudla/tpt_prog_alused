package ylesanded;

/**
 * Write the first line of a method named zool that takes three parameters: an int and two Strings.
 * Write a line of code that calls zool, passing as arguments the value 11, the name of your first pet, and the name of the street you grew up on.
 */
public class Zool {
    public static void zool(String name,String street, int value) {
        System.out.print("Name: "+name+", Street: "+street+", Value: "+value);
    }
    public static void main(String[] args) {
        zool("Laika","Vahtra",11);
    }
}
