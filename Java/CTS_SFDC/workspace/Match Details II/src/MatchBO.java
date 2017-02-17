
public class MatchBO {
	void displayAllMatchDetails(Match[] matchList) {
		System.out.printf("Match Details\n%-35s %-30s %-15s %s\n", "Team 1", "Team 2", "Date", "Venue");
		for(Match m : matchList) {
			System.out.println(m);
		}
	}
	
	void displaySpecificMatchDetails(Match[] matchList, String date) {
		System.out.printf("Match Details\n%-35s %-30s %-15s %s\n", "Team 1", "Team 2", "Date", "Venue");
		for(Match m : matchList) {
			if(date.equals(m.getDate())) {
				System.out.println(m);
			}
		}
	}
}
