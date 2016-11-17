package ylesanded;

/**
 * Created by kasutaja on 17.11.2016.
 */
public class Ex_7_4 {
    public static void main(String[] args) {
        test(3);
    }

    public static void test(int n){
        int result = 0;
        for (int i =1;i<=n;i++){
            result +=i;
        }
        System.out.println(result);
    }
}
