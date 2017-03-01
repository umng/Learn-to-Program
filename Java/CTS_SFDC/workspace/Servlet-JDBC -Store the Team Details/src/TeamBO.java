
import java.sql.SQLException;

public class TeamBO {
	public void createCity(City city)throws ClassNotFoundException,SQLException
	{
		TeamDAO teamins=new TeamDAO();
		teamins.createCity(city);
	}
	
	public Boolean createTeam(Team team)throws ClassNotFoundException,SQLException
	{
		TeamDAO teamins=new TeamDAO();
		return teamins.createTeam(team);
	}
	
	public int getPlayerIdByPlayerName(String name)throws ClassNotFoundException,SQLException
	{
		TeamDAO teamins=new TeamDAO();
		return teamins.getPlayerIdByPlayerName(name);
	}
	
	public int getCityIdByCityName(String name)throws ClassNotFoundException,SQLException
	{
		TeamDAO teamins=new TeamDAO();
		return teamins.getCityIdByCityName(name);
	}
}
