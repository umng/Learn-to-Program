import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Long noOfTestAppearance, noOfODIAppearance;
		String name, country, capNumber;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter player name ");
		name = sc.nextLine();
		System.out.println("Enter player country");
		country = sc.nextLine();
		System.out.println("Enter the Cap number");
		capNumber = sc.nextLine();
		System.out.println("Enter the number of test appearnace");
		noOfTestAppearance = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the number of ODI appearnace");
		noOfODIAppearance = sc.nextLong();
		sc.close();
		
		Player p = new InternationalPlayer(name, country, capNumber, noOfTestAppearance, noOfODIAppearance);
		p.displayDetails();
	}

}
