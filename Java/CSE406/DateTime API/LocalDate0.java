import java.time.*;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

class LocalDate0 {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    System.out.println("Now Date is " + now);

    LocalDate bDate = LocalDate.of(1995, 10, 12);
    System.out.println("My DOB is " + bDate);

    System.out.println("Is my DOB is before now?\t" + bDate.isBefore(now));
    System.out.println("Is my DOB year is in Leap year?\t" + bDate.isLeapYear());
    System.out.println("Day of my DOB is " + bDate.getDayOfWeek());

    System.out.println("The Date 2 days from now is " + now.plusDays(2));
    System.out.println("The Date 2 months from now is " + now.plusMonths(2));
    System.out.println("The Date 2 years from now is " + now.plusYears(2));
    System.out.println("Next TuesDay's date is " + now.with(next(TUESDAY)));  //TemporalAdjusters and DayOfWeek are statically imported to make sure that this line methods will run
  }
}
