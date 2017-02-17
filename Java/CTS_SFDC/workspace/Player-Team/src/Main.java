import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		s1 = sc.nextLine();
		System.out.println("Enter the team name");
		s2 = sc.nextLine();
		sc.close();
		
		UserMainClass.display(s1, s2);
	}
}
