import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerDAO {

	
	public Player validateLogin(String username,String password) throws SQLException, ClassNotFoundException {
		
		Connection con = DBConnection.getConnection();
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("select name,country,skill,team,username from player where username='" + username + "' and password='" + password + "'");
		
		if(rs.next()) {
			return new Player(rs.getString("name"), rs.getString("username"), rs.getString("country"), rs.getString("skill"), rs.getString("team"));
		}
		
		return null;
	}
}


