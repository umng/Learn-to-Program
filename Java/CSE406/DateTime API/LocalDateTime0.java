import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class LocalDateTime0 {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Date Time now is " + now);

    LocalTime time = LocalTime.of(9, 0);
    LocalDate date = LocalDate.of(1995, 10, 12);
    LocalDateTime bDateTime = LocalDateTime.of(date, time);
    // LocalDateTime bDateTime = LocalDateTime.of(1995, 10, 12, 9, 0);
    System.out.println("Date Time of my birth is " + bDateTime);

    System.out.println("Seconds since my birth is " + ~now.until(bDateTime, SECONDS));
  }
}
