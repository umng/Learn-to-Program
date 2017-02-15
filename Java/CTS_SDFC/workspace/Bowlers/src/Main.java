import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		int p;
		Scanner sc = new Scanner(System.in);
		
		TreeSet<String> players = new TreeSet<>();

		System.out.println("Enter the number of bowlers");
		p = sc.nextInt();
		sc.nextLine();
		for(int i=0; i< p; i++	) {
			players.add(sc.nextLine());
		}
		sc.close();

		System.out.println("Players list in ascending order");
		for(String s : players) {
			System.out.println(s);
		}
	}

}
