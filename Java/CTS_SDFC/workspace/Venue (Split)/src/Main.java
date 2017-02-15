import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the venue details");
		s = sc.nextLine();
		sc.close();
		
		String[] parts = s.split(",");
		Venue v = new Venue();
		v.name = parts[0];
		v.city = parts[1];
		
		System.out.printf("Venue Details\nVenue Name : %s\nCity Name : %s", v.name, v.city);
	}

}
