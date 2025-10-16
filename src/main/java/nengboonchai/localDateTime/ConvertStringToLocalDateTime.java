package nengboonchai.localDateTime;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConvertStringToLocalDateTime {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Date d2 = Calendar.getInstance().getTime();
        System.out.println(d2);
        GregorianCalendar today = new GregorianCalendar();
        System.out.println(today);
        Date d3 = GregorianCalendar.getInstance().getTime();
        System.out.println(d3);

// Example String representing a date
        String dateString = "2024-01-20";

        // Parse the String to LocalDate using the formatter
        LocalDate localDate = LocalDate.parse(dateString);

        // Output the type of the dateString variable
        System.out.println("Type of dateString: " + dateString.getClass().getName());
        System.out.println("Type of localDate: " + localDate.getClass().getName());

        // Output the LocalDate
        System.out.println("Parsed LocalDate: " + localDate);

        // Example String representing a date
        String dateString2 = "29-Mar-2019";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate localDate2 = LocalDate.parse(dateString2, formatter);

        // Output the type of the dateString variable
        System.out.println("Type of dateString: " + dateString.getClass().getName());

        System.out.println("Type of localDate: " + localDate2.getClass().getName());

        // Output the LocalDate
        System.out.println("Parsed LocalDate: " + localDate2);
    }
}
