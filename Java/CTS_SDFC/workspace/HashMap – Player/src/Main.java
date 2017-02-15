import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String s;
		String bowlerName;
		int wicketCount;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Player> bowlers = new HashMap<>();
		
		do {
			System.out.println("Enter the player name");
			bowlerName = sc.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			wicketCount = getWicketCount(sc.nextLine());
			bowlers.put(bowlerName ,new Player(bowlerName, wicketCount));
			System.out.println("Do you want to add another player (yes/no)");
			s = sc.nextLine();
		} while(s.toLowerCase().equals("yes"));
		
		do {
			System.out.println("Enter the player name to search");
			bowlerName = sc.nextLine();
			if(bowlers.containsKey(bowlerName)) {
				Player p = bowlers.get(bowlerName);
				System.out.printf("Player name : %s\nWicket Count : %d\n", p.getBowlerName(), p.getWicketCount());
			} else {
				System.out.printf("No player found with the name %s\n", bowlerName);
			}
			System.out.println("Do you want to search another player (yes/no)");
			s = sc.nextLine();
		} while(s.toLowerCase().equals("yes"));
		sc.close();
	}
	
	private static int getWicketCount(String s) {
		int i =0;
		StringTokenizer st = new StringTokenizer(s, "|");
		while(st.hasMoreTokens()) {
			st.nextToken();
			i++;
		}
		return i;
	}

}
