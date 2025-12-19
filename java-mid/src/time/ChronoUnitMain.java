package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        System.out.println(ChronoUnit.HOURS);
        System.out.println(ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println(ChronoUnit.DAYS);
        System.out.println(ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1,10,0);
        LocalTime lt2 = LocalTime.of(1,20,0);
        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println(secondsBetween);
        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println(minutesBetween);

    }
}
