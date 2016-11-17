package ylesanded;

/**
 The purpose of this exercise is to take a problem and break it into smaller problems,
 and to solve the smaller problems by writing simple methods.
 Consider the first verse of the song “99 Bottles of Beer”
 */
public class Ex_5_5 {
    public static void bottles(int bottles) {
        if (bottles!=0){
            System.out.println(bottles+"bottles of beer on the wall,\n" +
                    bottles+"bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around,\n" +
                    (bottles-1)+"bottles of beer on the wall.");
            System.out.println();
            bottles(bottles-1);
        }
        else{
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
        }
    }
    public static void main(String[] args) {
        bottles(3);
    }
}
