

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PlayerDAO {
    
    
    
    public List<Player> getAllPlayers() throws ClassNotFoundException, SQLException{
  	  	List<Player> players = new ArrayList<>();
  	  
        ResourceBundle rb= ResourceBundle.getBundle("mysql");
        
        String url=rb.getString("db.url");
        String user=rb.getString("db.username");
        String pass=rb.getString("db.password");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,pass);
        
        Statement statement = con.createStatement();
        
        String sql = "select * from player p order by name";
        
        ResultSet result = statement.executeQuery(sql);
        
        SkillDAO skillIns = new SkillDAO();
        
        while(result.next()) {
      	  players.add(new Player(result.getLong("id"), result.getString("name"), result.getString("country"), skillIns.getSkillByID(result.getLong("skill_id"))));
        }
        
        return players;
    }
    
    
}
