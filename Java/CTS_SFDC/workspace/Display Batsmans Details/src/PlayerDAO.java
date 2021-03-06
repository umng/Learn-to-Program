import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PlayerDAO {

	public List<Player> obtainAllBatsMan() throws ClassNotFoundException, SQLException {

		Connection con = DBConnection.getConnection();
		
		Statement statement = con.createStatement();

		String sql = "select * from player where skill_id=1 order by name;";
		ResultSet result = statement.executeQuery(sql);
		
		List<Player> players = new ArrayList<>();
		SkillDAO sdo = new SkillDAO();
		
		while(result.next()) {
			players.add(new Player(result.getInt("id"), result.getString("name"), result.getString("country"), sdo.getSkillById(result.getInt("skill_id"))));
		}
		
		return players;
	}

}
