import util.Measure;

public class BrittaPrimeNumberFinder {

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

        for(long x=3L ;x < number ; x=x+2 ){
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
