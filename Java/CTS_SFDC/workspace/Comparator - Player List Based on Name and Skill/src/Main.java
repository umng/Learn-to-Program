import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String name;
		int skillNo;
		String skill = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<>();
		
		System.out.println("Please provide the number of players to be registered");
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			System.out.println("Please enter player name");
			name = sc.nextLine();
			System.out.println("Please select the skill of the player\n1.All Rounder\n2.Batsman\n3.Bowler");
			skillNo = Integer.parseInt(sc.nextLine());
			if(skillNo == 1)	skill = "All Rounder";
			else if(skillNo == 2)	skill = "Batsman";
			else if(skillNo == 3)	skill = "Bowler";
			players.add(new Player(name, skill));
			i++;
		}
		sc.close();
		
		Collections.sort(players, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				if(o1.getSkill().compareTo(o2.getSkill()) == 0) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getSkill().compareTo(o2.getSkill());
			}
		});

		System.out.println("Player Details");
		for(Player t : players) {
			System.out.println("Player : " + t.getName() + " Skill  : " + t.getSkill());
		}
	}

}
