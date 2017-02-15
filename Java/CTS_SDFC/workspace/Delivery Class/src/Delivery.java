
public class Delivery {
	Long over, ball, runs;
	String batsman, bowler, nonStriker;
	
	public void displayDeliveryDetails() {
		System.out.printf("Delivery Details :\nOver : %d\nBall : %d\nRuns : %d\nBatsman : %s\nBowler : %s\nNonStriker : %s",
				over, ball, runs, batsman, bowler, nonStriker);
	}
}
