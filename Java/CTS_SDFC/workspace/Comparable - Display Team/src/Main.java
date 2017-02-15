import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String s;
		boolean isExist = false;
		String teamName;
		String playerName;
		Team team; 
		Scanner sc = new Scanner(System.in);
		ArrayList<Team> teams = new ArrayList<>();
		
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			i++;
			isExist = false;
			
			s = sc.nextLine();
			teamName = getTeamName(s);
			playerName = getPlayerName(s);
			
			for(Team t : teams) {
				if(t.getName().equals(teamName)) {
					team = t;
					teams.remove(teams.indexOf(t));
					team.addPlayer(playerName);
					teams.add(team);
					isExist = true;
					break;
				}
			}
			if(!isExist) {
				team = new Team(teamName);
				team.addPlayer(playerName);
				teams.add(team);
			}
			
		}
		sc.close();
		
		Collections.sort(teams);

		System.out.println("Teams and Players in ascending order");
		for(Team t : teams) {
			System.out.println(t.getName());
			for(Player p : t.getPlayerList()) {
				System.out.println("--" + p.getName());
			}
		}
	}
	
	private static String getTeamName(String s) {
		StringTokenizer st = new StringTokenizer(s, "|");
		return st.nextToken();
	}
	
	private static String getPlayerName(String s) {
		StringTokenizer st = new StringTokenizer(s, "|");
		st.nextToken();
		return st.nextToken();
	}

}
