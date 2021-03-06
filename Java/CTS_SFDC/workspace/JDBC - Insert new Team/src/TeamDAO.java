


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class TeamDAO {
  
  public void createTeam(Team team) throws ClassNotFoundException, SQLException {
       ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String username=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,username,pass);
      
      Statement statement = con.createStatement();
      
      String sql = "select id from team order by id desc";
      
      ResultSet result = statement.executeQuery(sql);
      result.next();
      
      long id = result.getLong("id");
      result.close();
      
      sql = "insert into team(id,name,coach,home_city_id) values(" 
    		  + (++id) + ",'" + team.getName() + "','" + team.getCoach() + "'," +  team.getCity().getCityId() + ")";
      statement.executeUpdate(sql);
      
      System.out.println("Team has been created");
  }
  
   public List<Team> getAllTeams() throws ClassNotFoundException, SQLException{
	  List<Team> teams = new ArrayList<>();
 	  	
      ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
      
      Statement statement = con.createStatement();
      
      String sql = "select * from team order by name";
      
      ResultSet result = statement.executeQuery(sql);
      
      CityDAO cityIns = new CityDAO();
      
      while(result.next()) {
    	  teams.add(new Team(result.getString("name"), result.getString("coach"), cityIns.getCityByID(result.getLong("home_city_id"))));
      }
      
      return teams;
  }
  
  
}
