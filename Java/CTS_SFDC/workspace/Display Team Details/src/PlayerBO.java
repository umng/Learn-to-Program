import java.sql.SQLException;
import java.util.List;


public class PlayerBO {

	public List<Player> getPlayerDetails(int id,int sid) throws ClassNotFoundException, SQLException {
		return new PlayerDAO().getPlayerDetails(id, sid);
	}
	
}
