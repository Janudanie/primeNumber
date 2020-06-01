package util;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Date;

public class Measure {
    private long lastTime;

    private long currentTime;
    private long timeDifference;
    private Duration d;

    private long interval;
    private long reached;
    private long number;

    public Measure(long number, long interval) {
        this.interval = interval;
        this.number = number;
    }


    public void start(){
        this.lastTime = new Date().getTime();
    }



    public void printSet(long reached){
        currentTime = new Date().getTime();
        timeDifference = currentTime - lastTime;

        long calcPerMilli = interval/ timeDifference;

        long remainingCalc = number - reached;

        Timestamp ts  = new Timestamp(currentTime + (remainingCalc/(calcPerMilli)) );
        System.out.print("Expected done date " + ts + "\r");
        this.lastTime = new Date().getTime();
    }





/*






                System.out.println("Expected time done : " +  ts );
                System.out.println(remainingCalc/(calcPerMilli));

    d = Duration.ofMillis  (remainingCalc/(calcPerMilli));


    //System.out.println(d.toSeconds());
                System.out.println(d.to d.toDaysPart() + " days  " + d.toHoursPart() + " hours " + d.toMinutesPart() +  " minutes"  + " " +d.toSecondsPart()  );


    //Timestamp ts = new Timestamp(new Date().getTime());
    //System.out.println(new Timestamp(lastTime));
    //System.out.println(" Calculations per second" + (interval / ();
    lastTime=new Date().getTime();*/
}
