import java.sql.*;

public class PlayerBO {
	
	public Player validateLogin(String username,String password) throws ClassNotFoundException,SQLException {
		 //fill the code
		Player  p=new PlayerDAO().validateLogin(username, password);
		return p;
	}
}


