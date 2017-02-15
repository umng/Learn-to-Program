import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the over details:");
		s = sc.nextLine();
		sc.close();
		
		System.out.printf("The over details is %s", s);
	}
}
