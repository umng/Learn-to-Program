
public class Batsman extends Player {
	Long noOfRuns;
	
	public Batsman(String name, String teamName, Long noOfMatches, Long noOfRuns) {
		super(name, teamName, noOfMatches);
		this.noOfRuns = noOfRuns;
	}

	void displayDetails() {
		super.displayDetails();
		System.out.printf("Number of runs scored : %d", noOfRuns);
	}
}
