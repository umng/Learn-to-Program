import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		String teamName;
		Integer noOfMatches;
		Long totalRaidPoints;
		Long totalDefencePoints;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player name");
		name = sc.nextLine();
		System.out.println("Enter team name");
		teamName = sc.nextLine();
		System.out.println("Enter number of matches played");
		noOfMatches = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter total raid points");
		totalRaidPoints = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter total defence points");
		totalDefencePoints = sc.nextLong();
		sc.close();
		
		Player p = new Player(name, teamName, noOfMatches, totalRaidPoints, totalDefencePoints);
		System.out.println("Player Details");
		p.displayKabbadiPlayerDetails();
	}

}
