import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class LocalTime0 {
  public static void main(String[] args) {
    LocalTime now = LocalTime.now();
    System.out.println("Now is " + now);

    LocalTime wTime = LocalTime.of(6, 30);
    System.out.println("I woke up at " + wTime);

    System.out.println("Had I woke up earlier than now?\t" + wTime.isBefore(now));
    System.out.println("Time after 5 seconds will be " + now.plusSeconds(5));
    System.out.println("Time after 5 minutes will be " + now.plusMinutes(5));
    System.out.println("Time after 5 hours will be " + now.plusHours(5));
    System.out.println("Time after 1 hours and 30 minutes will be " + now.plusHours(1).plusMinutes(30));

    System.out.println("Time truncated to seconds now is " + now.truncatedTo(SECONDS));
    System.out.println("Time truncated to seconds now is " + now.truncatedTo(SECONDS));
    System.out.println("Time truncated to minutes now is " + now.truncatedTo(MINUTES));
    System.out.println("Time truncated to Hours now is " + now.truncatedTo(HOURS));

    System.out.println("Time in second of day now is " + now.toSecondOfDay());

    LocalTime lunch = LocalTime.of(12, 0);
    System.out.println("Is lunch after now?\t" + lunch.isAfter(now));
    System.out.println("Time in minutes till lunch is " + now.until(lunch, MINUTES));

    LocalTime bedTime = LocalTime.of(23, 30);
    System.out.println("Time in hours till bed time is " + now.until(bedTime, HOURS));


  }
}
