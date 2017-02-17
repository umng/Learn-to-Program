  


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TeamDAO {
    
    
    
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
      	  teams.add(new Team(result.getLong("id"), result.getString("name"), result.getString("coach"), cityIns.getCityByID(result.getLong("home_city_id"))));
        }
        
        return teams;
    }
    
    
}
