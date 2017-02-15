import java.time.LocalDate;
import java.util.StringTokenizer;

public class UserMainCode {
	public static void displayDate(String s) {		
		StringTokenizer st = new StringTokenizer(s, "-");
		int yy = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int dd = Integer.parseInt(st.nextToken());
		
		LocalDate ld = LocalDate.of(yy, mm, dd);
		ld.plusMonths(20);
		
		s = "";
		s = ld.getYear() + "-";
		if(ld.getMonthValue() < 10)
			s += "0";
		s += ld.getMonthValue() + "-";
		if(ld.getDayOfMonth() < 10)
			s += "0";
		s += ld.getDayOfMonth();
		
		System.out.println("20 months after 2016-11-03 will be " + s);
	}
}
