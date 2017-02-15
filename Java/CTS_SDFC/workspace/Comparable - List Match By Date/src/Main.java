import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		int i = 0, n;
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date matchDate;
		String teamOne;
		String teamTwo;
		Scanner sc = new Scanner(System.in);
		ArrayList<Match> matches = new ArrayList<>();
		
		System.out.println("Enter the number of matches");
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			i++;
			System.out.println("Enter match date in (MM-dd-yyyy)");
			matchDate = sdf.parse(sc.nextLine());
			System.out.println("Enter Team 1");
			teamOne = sc.nextLine();
			System.out.println("Enter Team 2");
			teamTwo = sc.nextLine();
			matches.add(new Match(matchDate, teamOne, teamTwo));
		}
		sc.close();
		
		Collections.sort(matches);

		System.out.println("Match Details");
		i = 0;
		for(Match t : matches) {
			System.out.println("Team 1 " + t.getTeamOne());
			System.out.println("Team 2 " + t.getTeamTwo());
			System.out.println("Match held on " + String.valueOf(new SimpleDateFormat("MM-dd-yyyy").format(t.getMatchDate())));
		}
	}

}
