import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Venue v = new Venue();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the venue name");
		v.setName(sc.nextLine());
		System.out.println("Enter the city name");
		v.setCity(sc.nextLine());
		
		while(i != 3) {
			System.out.printf("Venue Details\nVenue Name : %s\nCity Name : %s\nVerify and Update Venue Details\n",
				v.getName(), v.getCity());
			System.out.println("Menu\n1.Update Venue Name\n2.Update City Name\n3.All informations Correct/Exit\nType 1 or 2 or 3");
			i = Integer.parseInt(sc.nextLine());
			if(i == 1) {
				System.out.println("Enter the venue name");
				v.setName(sc.nextLine());
			} else if(i == 2) {
				System.out.println("Enter the city name");
				v.setCity(sc.nextLine());
			} else if(i == 3) {
				System.out.printf("Venue Details\nVenue Name : %s\nCity Name : %s", v.getName(), v.getCity());
				break;
			}
		}
		sc.close();
	}

}
