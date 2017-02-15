
public class Player implements Comparable<Player> {
	String playername;
	String skill;
	long capNumber;
	
	public Player(String playername, String skill, long capNumber) {
		super();
		this.playername = playername;
		this.skill = skill;
		this.capNumber = capNumber;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public long getCapNumber() {
		return capNumber;
	}

	public void setCapNumber(long capNumber) {
		this.capNumber = capNumber;
	}
	
	@Override
	public int compareTo(Player o) {
		return (int) (o.getCapNumber() - this.getCapNumber());
	}
}
