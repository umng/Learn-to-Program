import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m, frequency = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> venues = new ArrayList<>();
		
		m = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< m; i++) {
			venues.add(sc.nextLine());
		}
		s = sc.nextLine();
		sc.close();
		
		for(String venue : venues) {
			if(venue.equals(s))
			frequency++;
		}
		
		System.out.println(frequency);
	}

}
