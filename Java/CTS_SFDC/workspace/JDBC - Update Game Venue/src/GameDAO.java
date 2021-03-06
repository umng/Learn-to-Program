

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;



public class GameDAO {

	

public List<Game> getAllGameDetails() throws ClassNotFoundException, SQLException {

       List<Game>Al=new ArrayList<>();
      try
      {
             
          ResourceBundle rb= ResourceBundle.getBundle("mysql");
          
          String url=rb.getString("db.url");
          String user=rb.getString("db.username");
          String pass=rb.getString("db.password");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,user,pass);
          
          Statement statement = con.createStatement();
          
          String sql = "select * from game";
          
          ResultSet result = statement.executeQuery(sql);
          
          while(result.next()) {
        	  Al.add(new Game(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(result.getDate("game_date"))), new VenueDAO().getVenueByID(result.getLong("venue_id"))));
          }
          
      } catch (Exception e) {	}
      
      return Al;

  }
  
  public void updateVenueDetails(Date gameDate,String venue) throws ClassNotFoundException, SQLException, ParseException {
    
	  ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
      VenueDAO venueIns=new VenueDAO();
      Long venueId=venueIns.getVenueByName(venue).getVenueId();
      
      Statement statement = con.createStatement();
      
      String sql = "update game set venue_id=" + venueId + " where game_date=\"" + new SimpleDateFormat("yyyy-MM-dd").format(gameDate) + "\"";
      statement.executeUpdate(sql); 
 
  }
  public static void displayGame(List<Game> gameList){
      System.out.format("%-15s %-30s\n","Game Date","Venue"); 
      
      for(Game g : gameList) { 
          System.out.println(String.format("%-15s %-30s", g.getGameDate(), g.getVenue().getVenueName()));
      }

  }
	
	
}
