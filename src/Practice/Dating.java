package Practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dating {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        System.out.println(date.getHour());
        System.out.println(date.getMinute());
        System.out.println(date.getSecond());
        //rodzdil mezi dvema datumama
        LocalDateTime other = LocalDateTime.of(2000,2,4,12,30,23);
        Duration dur = Duration.between(other, date);
        System.out.println("Uplynulo: ");
        System.out.println(dur.toDays() + " dni");
        other.getDayOfWeek() == ;
        System.out.println(date.getDayOfWeek());//vrati konstantu
        System.out.println(date.toLocalDate());
        System.out.println(date.getDayOfMonth());//vrati poradove misto v mesici
        System.out.println(date.getDayOfYear());//vrati kolikatz den v roce to je
        String smhDate = "2024-04-22";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime time = LocalDateTime.parse(smhDate);
        System.out.println("vyparsovano");
        System.out.println(time);

    }
}
