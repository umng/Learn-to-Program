import java.util.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;
import java.sql.*;

class JavaTest {
	public static void main(String[] args) {
		int i = 1;
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight(i++, LocalDateTime.of(2016,10,12,9,30), LocalDateTime.of(2016,10,12,12,30)));
		flights.add(new Flight(i++, LocalDateTime.of(2016,10,12,10,30), LocalDateTime.of(2016,10,12,12,10)));
		flights.add(new Flight(i++, LocalDateTime.of(2016,10,13,9,30), LocalDateTime.of(2016,10,13,16,0)));


		Scanner sc = new Scanner(System.in);
		System.out.println0

		int fId =
		while(id != 0) {

			flights.add(new Flight(i++, LocalDateTime.of(2016,10,12,9,30), LocalDateTime.of(2016,10,12,12,30)));
			System.out.print("Enter flight ID:\t");
			id = sc.nextInt();
		}

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mySqlDb","root","mkteq1mu");

			Statement insert=con.createStatement();

			insert.addBatch("DELETE FROM flight;");
			for(Flight f : flights) {
				insert.addBatch("INSERT INTO flight values(" + f.id + ", " + f.delayedDuration + ");");
			}

			insert.executeBatch();
			insert.close();

			System.out.println("--------FLIGHTS DELYED DURATIONS----------");
			System.out.print("Enter flight ID:\t");

			int id=1;
			id = sc.nextInt();
			while(id != 0) {
				Statement fetch = con.createStatement();
				ResultSet result = fetch.executeQuery("SELECT * FROM flight WHERE id=" + id + ";");
				while(result.next()) {
						System.out.print(result.getInt("id") + "\t-\t");
						System.out.println(result.getInt("delay"));
				}
				System.out.print("Enter flight ID:\t");
				id = sc.nextInt();
			}

			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class Flight {
	int id;
	LocalDateTime flightTime;
	LocalDateTime delayedTime;
	long delayedDuration;

	public Flight(int id, LocalDateTime flightTime, LocalDateTime delayedTime) {
		this.id = id;
		this.flightTime = flightTime;
		this.delayedTime = delayedTime;
		this.delayedDuration = flightTime.until(delayedTime, MINUTES);
	}
}
