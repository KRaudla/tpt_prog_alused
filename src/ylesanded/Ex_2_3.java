package ylesanded;
import java.math.RoundingMode;
import java.time.LocalDateTime;


/**
 * Created by kasutaja on 19.10.2016.
 */
public class Ex_2_3 {

    public static void main(String[] args) {

        int hour = LocalDateTime.now().getHour();
        int minute=LocalDateTime.now().getMinute();
        int second=LocalDateTime.now().getSecond();
        float secSinMidnight = ((hour*60)*60)+(minute*60)+second;
        // seconds since midnight
        System.out.println("Seconds since midnight: " +
                Math.round(secSinMidnight));
        float maxSeconds = (24*60)*60;
        System.out.println("Seconds remaining " +
                "in the day: "+Math.round(maxSeconds-secSinMidnight));
        float percent = (secSinMidnight/maxSeconds)*100;
        /*printf: The format specifier %.2f indicates that the following value should be
        displayed as floating-point, rounded to two decimal places
        %c defines the special character to print out '%'
        */
        System.out.printf("The percentage of the day that has passed: %.2f%c",
                percent,'%');



    }
}


