
import jdk.jfr.Unsigned;
import util.Measure;

import java.sql.SQLOutput;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Date;

public class AlicePrimeNumberFinder {



    public static void main(String[] args) {
        long x = 9223372036854775139L;
        System.out.println(isThisAPrime(x));
    }


    public static boolean isThisAPrime(long number){
        boolean itIsAPrime = true;
        int interval = 250_000_000;

        Measure watch = new Measure(number,interval);
        watch.start();
        long lastPrint = interval;

        for(long x=2L ;x < number ; x++ ){
            if(number % x == 0 ) {
                itIsAPrime = false;
            }
            if (x > lastPrint)
            {
                watch.printSet(x);
                lastPrint = x + interval;
            }
        }
        return itIsAPrime;
    }
}
