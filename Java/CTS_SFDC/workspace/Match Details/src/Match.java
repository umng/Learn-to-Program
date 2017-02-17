import java.text.SimpleDateFormat;

import java.util.Date;

public class Match {
	void displayMatchDetails(Date matchDate) {
		System.out.printf("Match Date : %s", String.valueOf(new SimpleDateFormat("MM-dd-yyyy").format(matchDate)));
	}
	
	void displayMatchDetails(String venue) {
		String[] parts = venue.split(",");
		System.out.printf("Match Venue :\nStadium : %s\nCity : %s", parts[0], parts[1]);
	}
	
	void displayMatchDetails(String winnerTeam,long runs) {
		System.out.printf("Match Outcome :\n%s won by %d runs", winnerTeam, runs);
	}
}
