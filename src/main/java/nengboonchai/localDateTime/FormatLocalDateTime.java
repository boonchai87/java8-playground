package nengboonchai.localDateTime;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatLocalDateTime {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Japan"));
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        // convert string to

        System.out.println("After Formatting: " + formatDateTime);
        Date d = new Date();
        System.out.println(d);
        System.out.println(Calendar.getInstance().getTime());
    }
}
