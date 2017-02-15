
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
public class CityDAO {
    
    public City getCityByID(Long id) throws ClassNotFoundException, SQLException {
        ResourceBundle rb= ResourceBundle.getBundle("mysql");
        
        String url=rb.getString("db.url");
        String user=rb.getString("db.username");
        String pass=rb.getString("db.password");
        Connection con = DriverManager.getConnection(url,user,pass);
        
        Statement statement = con.createStatement();
        
        String sql = "select id,name from city where id=" + id;
        
        ResultSet result = statement.executeQuery(sql);
        result.next();
 
        return new City(result.getLong("id"), result.getString("name"));
    }
    
}
