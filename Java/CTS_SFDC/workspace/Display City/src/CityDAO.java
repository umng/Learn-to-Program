import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
public class CityDAO {

  public List<City> listAllCity() throws ClassNotFoundException, SQLException{
	  List<City> cities = new ArrayList<>();
	  
       ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
      
      Statement statement = con.createStatement();
      
      String sql = "select id,name from city order by name";
      
      ResultSet result = statement.executeQuery(sql);
      
      while(result.next()) {
    	  cities.add(new City(result.getLong("id"), result.getString("name")));
      }
      
      return cities;
  }
  
}
