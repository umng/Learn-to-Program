
public class Team {
	public String name;
	public String coach;
	public String location;
	public String players;
	public String captain;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlayers() {
		return players;
	}
	public void setPlayers(String players) {
		this.players = players;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	public void displayTeamDetails() {
		System.out.printf("Team Details\nTeam : %s\nCoach : %s\nLocation : %s\nPlayers : %s\nCaptain : %s\n",
				getName(), getCoach(), getLocation(), getPlayers(), getCaptain());
	}
}
