import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //(LocalDate,LocalTime,LocalDateTime,UTC timestamped)
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
        Instant instant = Instant.now();
        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(datetime.format(formatter));

        LocalDateTime datetime1 = LocalDateTime.of(2025,1,1,12,0,0);
        LocalDateTime datetime2 = LocalDateTime.of(2025,1,1,0,0,0);

        if(datetime1.isBefore(datetime2)){
            System.out.println(datetime1+" is earlier than "+datetime2);
        }
        else if(datetime1.isAfter(datetime2)){
            System.out.println(datetime1+" is later than "+datetime2);
        }
        else if(datetime1.isEqual(datetime2)){
            System.out.println(datetime1+" is equal to "+datetime2);
        }
    }
}