
public class Player {
	String name;
	String teamName;
	Long noOfMatches;
	
	public Player(String name, String teamName, Long noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	
	void displayDetails() {
		System.out.printf("Bowler : %s\nTeam : %s\nNumber of matches : %d\n", name, teamName, noOfMatches);
	}
}
