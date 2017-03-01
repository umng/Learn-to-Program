import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PlayerDAO {

	public List<Player> getPlayerDetails(int  tid,int sid) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConnection.getConnection();
		
		Statement statement = con.createStatement();

		String sql = "select p.id, p.name, p.country, s.name as skill, t.name as team  from player p, skill s, team t where p.skill_id=s.id and p.team_id=t.id and skill_id=" + sid +" and team_id=" + tid + " order by name;";
		ResultSet result = statement.executeQuery(sql);
		
		List<Player> players = new ArrayList<>();
		SkillDAO sdo = new SkillDAO();
		TeamDAO tdo = new TeamDAO();
		
		while(result.next()) {
			players.add(new Player(result.getInt(1), result.getString(2), result.getString(3), sdo.getSkillByName(result.getString(4)), tdo.getTeamByName(result.getString(5))));
		}
		
		return players;
	}
	
	
}


