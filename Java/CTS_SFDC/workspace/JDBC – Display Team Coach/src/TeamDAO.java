

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TeamDAO {

	
	List<Team> listTeams(String teamName) throws SQLException, ClassNotFoundException
    {
	      
	       List<Team> Al = new ArrayList<>();

            Connection con = null;

            ResourceBundle rb = ResourceBundle.getBundle("mysql");
            String url = rb.getString("db.url");
            String user = rb.getString("db.username");
            String pass = rb.getString("db.password");

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TeamDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
            con = DriverManager.getConnection(url,user,pass);
            
            Statement statement = con.createStatement();
            
            String sql = "select * from team where name='" + teamName + "'";
            
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()) {
          	  Al.add(new Team(result.getString("name"), result.getString("coach")));
            }
            
            return Al;

 }
}
