import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Long r;
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu\n1.Match Date\n2.Match Venue\n3.Match Outcome");
		i = sc.nextInt();
		sc.nextLine();
		
		Match m = new Match();
		
		if(i == 1) {
			System.out.println("Enter the date of the match");
			s = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date dt = sdf.parse(s);
				m.displayMatchDetails(dt);
			} catch(Exception e) {
				
			}
		} else if(i == 2) {
			System.out.println("Enter venue of the match");
			s = sc.nextLine();
			m.displayMatchDetails(s);
		} else if(i == 3) {
			System.out.println("Enter the winner team of the match");
			s = sc.nextLine();
			System.out.println("Enter the number of runs");
			r = sc.nextLong();
			m.displayMatchDetails(s, r);
		}
		sc.close();
	}

}
