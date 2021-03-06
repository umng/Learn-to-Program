

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class TeamDAO {


public List<Team> getAllTeams() throws ClassNotFoundException, SQLException {
      
       List<Team> Al = new ArrayList<>();
      try
      {
  
          ResourceBundle rb= ResourceBundle.getBundle("mysql");
          
          String url=rb.getString("db.url");
          String user=rb.getString("db.username");
          String pass=rb.getString("db.password");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,user,pass);
          
          Statement statement = con.createStatement();
          
          String sql = "select * from team";
          
          ResultSet result = statement.executeQuery(sql);
          
          while(result.next()) {
        	  Al.add(new Team(result.getString("name"), result.getString("coach")));
          }
          
      } catch (Exception e) {	}
      
      return Al;
  }
  
  public void updateTeamDetails(String name,String coach) throws ClassNotFoundException, SQLException {
    
	  ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
      
      Statement statement = con.createStatement();
      
      String sql = "update team set coach='" + coach + "' where name='" + name + "'";
      statement.executeUpdate(sql); 
  }
  public static void displayTeams(List<Team> teamList){
      System.out.format("%-30s %-15s\n","Name","Coach");
      
      for(Team t : teamList) { 
          System.out.println(String.format("%-30s %-15s", t.getTeamName(), t.getCoachName()));
      }
  }
  
}
