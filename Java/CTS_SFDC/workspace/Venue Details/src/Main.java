import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name, city;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		name = sc.nextLine();
		System.out.println("Enter the city name");
		city = sc.nextLine();
		sc.close();
		
		Venue v = new Venue(name, city);
		VenueBO vb = new VenueBO();
		vb.displayVenueDetails(v);
	}

}
