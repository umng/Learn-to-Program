import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, f, fuelCapacity, cc, numberOfDoors;
		String make, vehicleNumber, fuelType, audioSystem;
		boolean kickStartAvailable;
		Scanner sc = new Scanner(System.in);	
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		i = sc.nextInt();
		sc.nextLine();	
		System.out.println("Vehicle Make:");
		make = sc.nextLine();
		System.out.println("Vehicle Number:");
		vehicleNumber = sc.nextLine();
		System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
		f = sc.nextInt();
		sc.nextLine();
		fuelType = f == 1 ? "Petrol" : "Diesel";
		System.out.println("Fuel Capacity:");
		fuelCapacity = sc.nextInt();
		sc.nextLine();
		System.out.println("Engine CC:");
		cc = sc.nextInt();
		sc.nextLine();
		
		Vehicle v;
		if(i == 1) {
			System.out.println("Audio System:");
			audioSystem = sc.nextLine();
			System.out.println("Number of Doors:");
			numberOfDoors = sc.nextInt();
			sc.close();
			
			v = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			v.displayMake();
			v.displayBasicInfo();
			v.displayDetailInfo();
		} else if(i == 2) {
			System.out.println("Kick Start Available(yes/no):");
			kickStartAvailable = sc.nextLine().equals("yes") ? true : false;
			sc.close();
			v = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
			v.displayMake();
			v.displayBasicInfo();
			v.displayDetailInfo();
		}
	}
}
