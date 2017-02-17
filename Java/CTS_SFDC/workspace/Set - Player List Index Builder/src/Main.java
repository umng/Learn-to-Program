import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		String s = null;
		String name, skill;
		HashSet<Player> players = new HashSet<>();
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter Player Name:");
			name = sc.nextLine();
			System.out.println("Enter Skill:");
			skill = sc.nextLine();
			Player player = new Player(name, skill);
			flag = false;
			Iterator<Player> iterator = players.iterator();
			while(iterator.hasNext()) {
				Player p = iterator.next();
				if(player.equals(p))
					flag = true;
			}
			if(!flag)
				players.add(player);
			else
				System.out.printf("Player %s already exist\n", player.getName());
			System.out.println("Do you want to continue(yes/no):");
			s = sc.nextLine();
		} while(s.toLowerCase().equals("yes"));
		sc.close();
		
		IndexBuilder ib = new IndexBuilder();
		TreeSet<Index> indexes =  ib.buildIndex(players);
		ib.displayIndex(indexes);
	}

}
