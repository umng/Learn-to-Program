
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SkillDAO {
    
    public Skill getSkillByID(Long id) throws ClassNotFoundException, SQLException {
        ResourceBundle rb= ResourceBundle.getBundle("mysql");
        
        String url=rb.getString("db.url");
        String user=rb.getString("db.username");
        String pass=rb.getString("db.password");
        Connection con = DriverManager.getConnection(url,user,pass);
        
        Statement statement = con.createStatement();
        
        String sql = "select id,name from skill where id=" + id;
        
        ResultSet result = statement.executeQuery(sql);
        result.next();
 
        return new Skill(result.getLong("id"), result.getString("name"));
    }
    
}
