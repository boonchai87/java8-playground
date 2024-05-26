package nengboonchai.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestLocalTime {
    public static void main(String[] args) {
        LocalTime localTime =LocalTime.now();
        System.out.println(localTime);
        // formatt
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(formatTime.format(localTime));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
