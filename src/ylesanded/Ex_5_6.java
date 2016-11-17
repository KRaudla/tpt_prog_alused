package ylesanded;

/**
 Write the number 1 next to the first line of code in this program that will execute.
 Write the number 2 next to the second line of code, and so on until the end of the program.
 If a line is executed more than once, it might end up with more than one number next to it.
 */

public class Ex_5_6 {
    public static void baffle(String blimp) {//8
        System.out.println(blimp);//9
        zippo("ping", -5);//10
    }
    public static void zippo(String quince, int flag) {//3//11
        if (flag < 0) {//4//12
            System.out.println(quince + " zoop");//13
        } else {//5
            System.out.println("ik");//6
            baffle(quince);//7
            System.out.println("boo-wa-ha-ha");//14
        }
    }
    public static void main(String[] args) {//1
        zippo("rattle", 13);//2
    }
}

//What is the value of the parameter blimp when baffle gets invoked?
//13

//What is the output of this program?
/**
*ik
*rattle
*ping zoop
*boo-wa-ha-ha
*/