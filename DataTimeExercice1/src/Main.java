import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate date01 = LocalDate.now();
        LocalDateTime datewithtime = LocalDateTime.now();
        Instant instantDate = Instant.now();
        String dateAPI = "20/12/2021 02:33";

        LocalDateTime formartDate = LocalDateTime.parse(dateAPI, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formartDateZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(date01);
        System.out.println(date01.format(formater1));
        System.out.println(datewithtime);
        System.out.println(formater2.format(datewithtime));
        System.out.println(instantDate);
        System.out.println("BR : "+formartDateZone.format(instantDate));
        System.out.println(formartDate);
    }
}