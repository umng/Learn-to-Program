import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String date;
		String teamOne;
		String teamTwo;
		String venue;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of matches");
		n = sc.nextInt();
		sc.nextLine();
		Match[] matchList = new Match[n];
		while(i<n) {
			System.out.printf("Enter match %d details\n", ++i);
			System.out.println("Enter the match date");
			date = sc.nextLine();
			System.out.println("Enter the team one");
			teamOne = sc.nextLine();
			System.out.println("Enter the team two");
			teamTwo = sc.nextLine();
			System.out.println("Enter the Venue");
			venue = sc.nextLine();
			matchList[i-1] = new Match(date, teamOne, teamTwo, venue);
		}
		MatchBO mbo = new MatchBO();
		mbo.displayAllMatchDetails(matchList);
		
		System.out.println("Enter the date to be searched");
		date = sc.nextLine();
		sc.close();
		mbo.displaySpecificMatchDetails(matchList, date);
	}
}
