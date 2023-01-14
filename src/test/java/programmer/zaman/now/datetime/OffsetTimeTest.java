package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {
    @Test
    void create() {
        OffsetTime offsetTime1 = OffsetTime.now();
        OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetTime offsetTime3 = OffsetTime.of(7, 8, 9, 10, ZoneOffset.ofHours(7));
        OffsetTime offsetTime4 = OffsetTime.parse("07:08:09.100000000+07:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTime4);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("2000-09-17T07:08:09.100000000+08:00");

        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
        System.out.println(offsetDateTime4);
    }

    @Test
    void toLocalTime() {
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        OffsetTime offsetTime1 = localTime1.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetTime1);

        LocalTime localTime2 = offsetTime1.toLocalTime();
        System.out.println(localTime2);
    }

    @Test
    void toLocalDateTime() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        OffsetDateTime offsetDateTime1 = localDateTime1.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime1);

        LocalDateTime localDateTime2 = offsetDateTime1.toLocalDateTime();
        System.out.println(localDateTime2);
    }
}
