import java.sql.*;

public class PlayerDAO {

	
	public Player validateLogin(String username,String password) throws SQLException, ClassNotFoundException {
		//fill the code
		Connection con=new DBConnection().getConnection();
		ResultSet rs=con.createStatement().executeQuery("Select name,username,country,skill,team,password from player where username='"+username+"'");
		if(!rs.next())
		return null;
		if(rs.getString(6).equals(password))
			return new Player(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		return null;
	}
}


