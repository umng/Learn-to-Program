import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();
		if(UserMainCode.validateTeam(s)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
