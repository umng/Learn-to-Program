import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String name;
		Long numberOfMatches;
		Scanner sc = new Scanner(System.in);
		ArrayList<Team> teams = new ArrayList<>();
		
		System.out.println("Enter number of teams:");
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			System.out.println("Enter team " + (++i) + " detail");
			System.out.println("Enter Name");
			name = sc.nextLine();
			System.out.println("Enter number of matches");
			numberOfMatches = Long.parseLong(sc.nextLine());
			teams.add(new Team(name, numberOfMatches));
		}
		sc.close();
		
		Collections.sort(teams);

		System.out.println("Team list after sort by number of matches");
		for(Team t : teams) {
			System.out.println(t.getName() + "-" + t.getNumberOfMatches());
		}
	}

}
