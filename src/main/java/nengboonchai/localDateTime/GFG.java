package nengboonchai.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GFG {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Adding 1 year, 1 month, 1 week and 1 day
        LocalDateTime localDateTime1 = now.plusYears(1)
                .plusMonths(1)
                .plusWeeks(1)
                .plusDays(1);
        // Print statement
        System.out.println(localDateTime1);

        // Subtracting 1 year, 1 month, 1 week and 1 day
        LocalDateTime localDateTime2
                = localDateTime1.minusYears(1)
                .minusMonths(1)
                .minusWeeks(1)
                .minusDays(1);
        // Print statement
        System.out.println(localDateTime2);

        // Adding 1 hour, 1 minute, 1 second and 100
        // nanoseconds
        LocalDateTime localDateTime3
                = localDateTime2.plusHours(1)
                .plusMinutes(1)
                .plusSeconds(1)
                .plusNanos(100);
        // Print statement
        System.out.println(localDateTime3);

        // Subtracting 1 hour, 1 minute, 1 second and 100
        // nanoseconds
        LocalDateTime localDateTime4
                = localDateTime3.minusHours(1)
                .minusMinutes(1)
                .minusSeconds(1)
                .minusNanos(100);
        // Print statement
        System.out.println(localDateTime4);

        // Milliseconds
        LocalDateTime localDateTime5 = LocalDateTime.of(
                2021, 04, 24, 14, 33, 48, 123456789);
        // Print statement
        System.out.println(localDateTime5);

        // Local date + Local time
        LocalDate date = LocalDate.of(2021, 04, 24);
        LocalTime time = LocalTime.of(10, 34);
        System.out.println(time);
        System.out.println(date);

        LocalDateTime localDateTime6
                = LocalDateTime.of(date, time);
        // Print statement
        System.out.println(localDateTime6);


    }
}
