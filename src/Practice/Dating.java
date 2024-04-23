package Practice;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dating {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("now: " + LocalDateTime.now());
        System.out.println("hour: " + date.getHour());
        System.out.println("min: " + date.getMinute());
        System.out.println("sec: " + date.getSecond());
        System.out.println("day of week: " + date.getDayOfWeek());//vrati konstantu
        System.out.println("local date: " + date.toLocalDate());
        System.out.println("day of month: " + date.getDayOfMonth());//vrati poradove misto v mesici
        System.out.println("day of year: " + date.getDayOfYear());//vrati kolikatz den v roce to je
        //rodzdil mezi dvema datumama
        LocalDateTime other = LocalDateTime.of(2000, 2, 4, 12, 30, 23);
        System.out.println("\nfirst date is " + date);
        System.out.println("seconds date is " + other);
        Duration dur = Duration.between(other, date);
        System.out.println("between first and second date are " + dur.toDays() + " days");
        double inYear = (dur.toDays()/365.0);
        System.out.println("in years: " + inYear);

//        dur.toDays()
//        other.getDayOfWeek() == ;


        String smhDate = "2024-04-22";
        System.out.println("\nBefore: " + smhDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parseTime = LocalDate.parse(smhDate, formatter);
        System.out.println("After: " + parseTime);

        parseTime.isLeapYear(); //prestupny rok, muzeme pouzivat pouze s LocalDate
        if (parseTime.isLeapYear()) {
            System.out.println("Is leap year: " + parseTime);
        } else {
            System.out.println("Is not leap year: " + parseTime);
        }

        System.out.println("\n" + date);
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Is weekend");
        } else {
            System.out.println("Is not a weekend");
        }

    }
}
