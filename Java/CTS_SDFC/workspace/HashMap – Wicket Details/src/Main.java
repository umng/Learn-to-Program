import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String s;
		String bowlerName;
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Wicket> wickets = new LinkedHashMap<>();
		
		do {
			System.out.println("Enter the player name");
			bowlerName = sc.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol");
			for(String playerName : getWickets(sc.nextLine())) {
				wickets.put(playerName ,new Wicket(playerName, new Bowler(bowlerName)));
			}
			System.out.println("Do you want to add another player (yes/no)");
			s = sc.nextLine();
		} while(s.toLowerCase().equals("yes"));
		
		do {
			boolean flag = true;
			System.out.println("Enter the player name to search");
			bowlerName = sc.nextLine();
			for(Map.Entry<String, Wicket> m : wickets.entrySet()) {
				Wicket w = m.getValue();
				if(w.getBowler().getName().equals(bowlerName)) {
					if(flag) {
						System.out.printf("Player Name : %s\nWickets :\n", bowlerName);
						flag = false;
					}
					System.out.printf("%s\n", w.getPlayerName());
				}
			}
			if(flag)
				System.out.printf("No player found with the name %s\n", bowlerName);
			System.out.println("Do you want to search another player (yes/no)");
			s = sc.nextLine();
		} while(s.toLowerCase().equals("yes"));
		sc.close();
	}
	
	private static ArrayList<String> getWickets(String s) {
		ArrayList<String> wickets = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(s, "|");
		while(st.hasMoreTokens()) {
			wickets.add(st.nextToken());
		}
		return wickets;
	}

}
