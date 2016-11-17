package ylesanded;

/**
 * Created by kasutaja on 17.11.2016.
 */
public class Ex_6_4_multAdd {

    public static double multadd(double a, double b, double c){
        return a * b + c;
    }
    public static void expSum(double x){
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1.0 - b);
        multadd(a, b, c);

    }
    public static void main(String[] args) {
        //ystem.out.println(multadd(1.0,2.0,3.0));
        System.out.println(multadd(1.0,2.0,3.0));
        double a = Math.cos(Math.PI/4.0);
        double b = 1.0/2.0;
        double c = Math.sin(Math.PI/4.0);
        System.out.println(multadd(a,b,c));
        double a2 = 1.0;
        double b2 = Math.log(10);
        double c2 = Math.log(20);
        System.out.println(multadd(a2,b2,c2));

    }
}
