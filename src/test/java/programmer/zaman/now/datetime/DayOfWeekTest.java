package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void create() {
        DayOfWeek dayOfWeek1 = DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(2);
        DayOfWeek dayOfWeek3 = dayOfWeek1.minus(2);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);
    }
}
