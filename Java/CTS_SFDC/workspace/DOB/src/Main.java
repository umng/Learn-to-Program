import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the DOB:");
		
		try {
			Date DOB = sdf.parse(sc.nextLine());
			sc.close();
			System.out.println("Dhoni was born on " + String.valueOf(new SimpleDateFormat("MMMM dd,yyyy").format(DOB.getTime())));
		} catch (Exception e) {
			
		}
	}
}
