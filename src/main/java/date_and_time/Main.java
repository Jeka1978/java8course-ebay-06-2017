package date_and_time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime beni = LocalDateTime.of(1989, 3, 21, 0, 0);
        LocalDateTime jeka = LocalDateTime.of(1978, 10, 3, 0, 0);
        long between = ChronoUnit.DAYS.between(jeka, beni);

        LocalDateTime dateTime = beni.withYear(1988);
        int value = dateTime.getDayOfWeek().getValue();
        System.out.println(dateTime.getDayOfWeek());
        System.out.println("value = " + value);

        System.out.println("between = " + between);
    }
}
