package team;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO{

    public List<Team> obtainAllTeams() throws ClassNotFoundException, SQLException {
    	
    	Statement statement = DBConnection.getConnection().createStatement();
    	
    	String sql = "select * from team order by name";
    	
    	ResultSet result = statement.executeQuery(sql);
    	
    	List<Team> teams = new ArrayList<>();
    	
    	while(result.next()) {
    		teams.add(new Team(result.getString("name"), result.getString("coach")));
    	}
    	
    	return teams;
    }


	public int createTeam(Team team) throws SQLException, ClassNotFoundException {
    	
    	Statement statement = DBConnection.getConnection().createStatement();
    	
    	String sql = "insert into team(id,name,coach,home_city_id) values(" + team.getId() + ",'" + team.getName() + "','" + team.getCoach() + "'," + team.getCity().getId() + ")";
    	
    	return statement.executeUpdate(sql);
	}
		
}
    
    



