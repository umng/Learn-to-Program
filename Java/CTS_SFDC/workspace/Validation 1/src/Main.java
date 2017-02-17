import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();
		if(UserMainCode.validatePlayer(s.substring(0, s.indexOf(" ")), s.substring(s.indexOf(" ") + 1))) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
