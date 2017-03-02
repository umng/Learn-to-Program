package gameDetail;

import java.sql.SQLException;

public class VenueBO {
	public String[] getAllVenues() throws ClassNotFoundException, SQLException {
		
		return new VenueDAO().getAllVenues();
	}
}

