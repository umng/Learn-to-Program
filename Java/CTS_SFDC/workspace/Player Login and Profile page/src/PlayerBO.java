import java.sql.SQLException;

public class PlayerBO {
	
	public Player validateLogin(String username,String password) throws ClassNotFoundException,SQLException {
		 return new PlayerDAO().validateLogin(username, password);
	}
}


