package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {
    @Test
    void fromLegacy() {
        Date date = new Date();
        System.out.println(date);
        Instant instant1 = date.toInstant();
        System.out.println(instant1);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Instant instant2 = calendar.toInstant();
        System.out.println(instant2);

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        ZoneId zoneId1 = timeZone.toZoneId();
        System.out.println(zoneId1);
    }

    @Test
    void toLegacy() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println(date);

        Calendar calendar = GregorianCalendar.from(zonedDateTime);
        System.out.println(calendar);

        ZoneId zoneId = ZoneId.systemDefault();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);
    }
}
