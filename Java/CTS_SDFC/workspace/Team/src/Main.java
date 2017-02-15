import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team t = new Team();
		
		System.out.println("Enter the team name");
		t.setName(sc.nextLine());
		System.out.println("Enter the coach name");
		t.setCoach(sc.nextLine());
		System.out.println("Enter the location name");
		t.setLocation(sc.nextLine());
		System.out.println("Enter the players name");
		t.setPlayers(sc.nextLine());
		System.out.println("Enter the captain name");
		t.setCaptain(sc.nextLine());
		sc.close();
		
		t.displayTeamDetails();
	}

}
