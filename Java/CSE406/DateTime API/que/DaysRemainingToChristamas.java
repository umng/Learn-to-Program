import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class DaysRemainingToChristamas {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    System.out.println("Now Date is " + now);

    LocalDate cDate = LocalDate.of(2016, 12, 25);
    System.out.println("Christmas is on " + cDate);

    System.out.println("Days remaining to Christmas is " + now.until(cDate, DAYS));
  }
}
