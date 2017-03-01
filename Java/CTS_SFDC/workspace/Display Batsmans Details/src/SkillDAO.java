import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SkillDAO {

	public Skill getSkillById(int id) throws ClassNotFoundException, SQLException {
    
		Connection con = DBConnection.getConnection();
		
		Statement statement = con.createStatement();

		String sql = "select id,name from skill where id=" + id;

		ResultSet result = statement.executeQuery(sql);
		result.next();

		return new Skill(result.getInt("id"), result.getString("name"));
		
	}

}
