
public class Bowler extends Player {
	Long noOfWickets;

	public Bowler(String name, String teamName, Long noOfMatches, Long noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.printf("Number of wickets taken : %d", noOfWickets);
	}
}
