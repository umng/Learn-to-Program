import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> teams = new ArrayList<>();

		System.out.println("Enter swap positons");
		for(int i = 0; i < 5; i++) {
			teams.add(sc.nextLine());
		}
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		sc.close();
		
		String s = teams.get(x);
		teams.set(x, teams.get(y));
		teams.set(y, s);
		
		for(String team : teams) {
			System.out.println(team);
		}
	}

}
