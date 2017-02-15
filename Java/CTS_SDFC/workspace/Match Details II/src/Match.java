
public class Match {
	String date;
	String teamOne;
	String teamTwo;
	String venue;
	
	public Match(String date, String teamOne, String teamTwo, String venue) {
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		return String.format("%-35s %-30s %-15s %s", this.getTeamOne(), this.getTeamTwo(), this.getDate(), this.getVenue());
	}
}
