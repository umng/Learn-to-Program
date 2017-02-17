import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String playername;
		String skill;
		long capNumber;
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<>();
		
		System.out.println("Enter number of players:");
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			System.out.println("Enter player " + (++i) + " detail");
			System.out.println("Enter Name");
			playername = sc.nextLine();
			System.out.println("Enter Skill");
			skill = sc.nextLine();
			System.out.println("Enter Cap Number");
			capNumber = Long.parseLong(sc.nextLine());
			players.add(new Player(playername, skill, capNumber));
		}
		sc.close();
		
		Collections.sort(players);

		System.out.println("Player list after sorting by cap number in descending order");
		i = 0;
		for(Player p : players) {
			System.out.println(p.getPlayername() + "-" + p.getCapNumber());
		}
	}

}
