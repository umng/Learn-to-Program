import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Long noOfMatches, noOfWickets, noOfRuns;
		String name, teamName;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter player name");
		name = sc.nextLine();
		System.out.println("Enter team name");
		teamName = sc.nextLine();
		System.out.println("Enter number of matches");
		noOfMatches = sc.nextLong();
		sc.nextLine();
		System.out.println("Menu\n1.Bowler details\n2.Batsman details\nEnter choice");
		i = sc.nextInt();
		sc.nextLine();
		
		Player p;
		
		if(i == 1) {
			System.out.println("Enter number of wicktes taken");
			noOfWickets = sc.nextLong();
			p = new Bowler(name, teamName, noOfMatches, noOfWickets);
			p.displayDetails();
		} else if(i == 2) {
			System.out.println("Enter number of runs scored");
			noOfRuns = sc.nextLong();
			p = new Batsman(name, teamName, noOfMatches, noOfRuns);
			p.displayDetails();
		}
		sc.close();
	}

}
