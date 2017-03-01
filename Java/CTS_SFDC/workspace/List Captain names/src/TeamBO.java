import java.sql.SQLException;


public class TeamBO {

	public Team getTeamById(int id) throws ClassNotFoundException, SQLException {
		return new TeamDAO().getTeamById(id);
	}

	public int updateCoachName(Integer id, String coach) throws ClassNotFoundException, SQLException {
		return new TeamDAO().updateCoachName(id, coach);
	}

}
