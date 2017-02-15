
public class Innings {
	String number, battingTeam;
	Long runs;
	
	public void displayInningsDetails() {
		System.out.printf("Innings Details :\nInnings number : %s\nBattingTeam : %s\nRuns scored :%d", number, battingTeam, runs);
	}
}
