import util.Measure;

public class EmmaPrimeNumberFinder {
    public static void main(String[] args) {
        long x = 9223372036854775139L;

        while(!isThisAPrime(x)) {
            x++;}
        System.out.println(x);
        System.out.println(isThisAPrime(x));
    }


    public static boolean isThisAPrime(long number){
        boolean itIsAPrime = true;
        int interval = 250_000_000;

        Measure watch = new Measure((long) Math.sqrt(number),interval);
        watch.start();
        long lastPrint = interval;

        for(long x=3L ;x < Math.sqrt(number) ; x=x+2 ){
            if(number % x == 0 ) {
                return false;
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
