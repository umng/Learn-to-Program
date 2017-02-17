
public class Player implements IKabbadiPlayerStatistics {
	private
	String name;
	String teamName;
	Integer noOfMatches;
	Long totalRaidPoints;
	Long totalDefencePoints;
	
	public Player(String name, String teamName, Integer noOfMatches, Long totalRaidPoints, Long totalDefencePoints) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.totalRaidPoints = totalRaidPoints;
		this.totalDefencePoints = totalDefencePoints;
	}

	public void displayKabbadiPlayerDetails() {
		System.out.printf("Player name : %s\nTeam name : %s\nNo of matches : %d\nTotal raid points: %d\nTotal defence points: %d\n",
				name, teamName, noOfMatches, totalRaidPoints, totalDefencePoints);
	}
}
