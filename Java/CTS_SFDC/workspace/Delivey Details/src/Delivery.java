import java.util.StringTokenizer;

public class Delivery {
	void displayDeliveryDetails(String bowler,String batsman) {
		StringTokenizer st1 = new StringTokenizer(bowler);
		st1.nextToken();
		StringTokenizer st2 = new StringTokenizer(batsman);
		st2.nextToken();
		System.out.printf("Bowler : %s\nBatsman : %s", st1.nextToken(), st2.nextToken());
	}
	
	void displayDeliveryDetails(Long runs) {
		System.out.printf("Number of runs scored in the delivery : %d", runs);
		if(runs == 4) {
			System.out.print("\nIt is a Boundary.");
		} else if(runs == 6) {

			System.out.print("\nIt is a Sixer.");
		}
	}
}
