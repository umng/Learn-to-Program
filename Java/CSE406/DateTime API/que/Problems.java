import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class Problems {
  public static void main(String[] args) {
      //Abe
      LocalDate bDateAbe = LocalDate.of(1970, 9, 25);
      LocalDate nowAbe = LocalDate.now();
      System.out.println("Abe was " + bDateAbe.until(nowAbe, YEARS) + " when he died.");
      System.out.println("Abe lived for " + bDateAbe.until(nowAbe, DAYS) + " days.");
      System.out.println();

      //Bernadict
      LocalDate bDate = LocalDate.of(1984, 9, 24);
      LocalDate nowBernadict = LocalDate.now();
      System.out.println("Bennadict was born in a leap year: " + bDate.isLeapYear());
      System.out.println("Days in the year he was born: " + bDate.lengthOfYear() /*( bDate.isLeapYear() ? 366 : 365) */);
      System.out.println("Bernadict is " + bDate.until(nowBernadict, DECADES) + " decades old.");
      LocalDate bDay21 = bDate.plusYears(21);
      System.out.println("It was a " +  bDay21.getDayOfWeek() + " on his 21th birthday.");
      System.out.println();

      //Travel time
      LocalTime travelStartTime = LocalTime.of(8, 44);
      LocalTime travelEndTime = LocalTime.of(14, 24);
      System.out.println("Planned Travel Time: " + travelStartTime.until(travelEndTime, MINUTES) + " Minutes");
      LocalTime travelArrivalTime = travelEndTime.plusMinutes(380);
      System.out.println("Delayed arrival time: " + travelArrivalTime);
      System.out.println();

      //Miami
      LocalDateTime flightTime = LocalDateTime.of(2014, 3, 25, 1, 30);
      System.out.println("The flight arrival time in Miami: " + flightTime);
      LocalDateTime flightDelayedTime = flightTime.plusHours(4).plusMinutes(27);
      System.out.println("The flight delayed time in Miami: " + flightDelayedTime);
      System.out.println();

      //School
      LocalDate startDateSchool = LocalDate.of(2014, 9, 9);
      LocalDate endDateSchool = LocalDate.of(2015, 6, 25);
      System.out.println("School starts: " + startDateSchool);
      System.out.println("School ends: " + endDateSchool);
      System.out.println("Number of Total days: " + startDateSchool.until(endDateSchool, DAYS));
      int schoolDays = 0, i = 0;
      while(startDateSchool.plusDays(i).isBefore(endDateSchool)) {
        if(startDateSchool.plusDays(i).getDayOfWeek().toString() != "SATURDAY" && startDateSchool.plusDays(i).getDayOfWeek().toString() != "SUNDAY")
          schoolDays++;
        i++;
      }
      System.out.println("Number of school days: " + schoolDays);
      System.out.println();

      //Meeting time
      LocalDateTime meetingTime = LocalDateTime.of(2014, 8, 5, 13, 30);
      System.out.println("The meeting time is: " + meetingTime);

  }
}
