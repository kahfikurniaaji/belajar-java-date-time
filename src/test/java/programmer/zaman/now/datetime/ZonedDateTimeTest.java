package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    @Test
    void create() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(8));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);
    }

    @Test
    void parsing() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2000-09-17T04:30:15+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2000-09-17T04:30:15+08:00");

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

    @Test
    void changeZoneId() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
