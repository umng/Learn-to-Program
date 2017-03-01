import java.sql.SQLException;


public class TeamBO {
	public Team getTeamByName(String name) throws ClassNotFoundException, SQLException {
		return new TeamDAO().getTeamByName(name);
		
	}

}
