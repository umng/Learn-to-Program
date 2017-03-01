import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TeamDAO {

	public Team getTeamByName(String name) throws SQLException, ClassNotFoundException {
		Connection con = DBConnection.getConnection();
		
		Statement statement = con.createStatement();

		String sql = "select * from team where name='" + name + "';";

		ResultSet result = statement.executeQuery(sql);
		result.next();
		
		return new Team(result.getInt("id"), result.getString("name"), result.getString("coach"));

	}
}
