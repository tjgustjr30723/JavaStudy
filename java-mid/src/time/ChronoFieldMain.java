package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        System.out.println(ChronoField.MONTH_OF_YEAR.range());
        System.out.println(ChronoField.DAY_OF_MONTH.range());
    }
}
