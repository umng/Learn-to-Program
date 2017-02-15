import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team> {
	String name;
	List<Player> playerList;
	
	public Team(String name) {
		super();
		this.name = name;
		playerList = new ArrayList<>();
	}
	
	void addPlayer(String playername) {
		playerList.add(new Player(playername));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	@Override
	public int compareTo(Team o) {
		return this.getName().compareTo(o.getName());
	}
}
