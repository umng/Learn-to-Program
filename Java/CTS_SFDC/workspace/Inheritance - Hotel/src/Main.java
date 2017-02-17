import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, numberOfSqFeet; 
		String hotelName, t, w;
		boolean hasTV, hasWifi;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		i = sc.nextInt();
		sc.nextLine();	
		System.out.println("Hotel Name:");
		hotelName = sc.nextLine();
		System.out.println("Room Square Feet Area:");
		numberOfSqFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Room has TV (yes/no):");
		t = sc.nextLine();
		hasTV = t.equals("yes") ? true : false;
		System.out.println("Room has Wifi (yes/no):");
		w = sc.nextLine();
		hasWifi = w.equals("yes") ? true : false;
		sc.close();
		
		HotelRoom hr;
		if(i == 1) {
			hr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.printf("Room Tariff per day is:%d", hr.calculateTariff());
		} else if(i == 2) {
			hr = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.printf("Room Tariff per day is:%d", hr.calculateTariff());
		} else if(i == 3) {
			hr = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.printf("Room Tariff per day is:%d", hr.calculateTariff());
		}
	}

}
