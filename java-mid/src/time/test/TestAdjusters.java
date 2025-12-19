package time.test;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        LocalDate today = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        DayOfWeek with1 = today.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + dayOfWeek);
        System.out.println("lastDayOfWeek = " + with1);
    }
}