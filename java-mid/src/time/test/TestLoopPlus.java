package time.test;

import java.time.LocalDate;
public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate test = LocalDate.of(2024,1,1);
        int i = 1;
        while (i < 6){
            System.out.println("날짜 " + i + ": " + test);
            test = test.plusWeeks(2);
            i++;
        }

    }
}
