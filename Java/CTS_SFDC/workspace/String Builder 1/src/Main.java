import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String firstName,lastName;
		Scanner sc = new Scanner(System.in);
		firstName = sc.nextLine();
		lastName = sc. nextLine();
		sc.close();
		
		UserMainCode.display(firstName, lastName);
	}

}
