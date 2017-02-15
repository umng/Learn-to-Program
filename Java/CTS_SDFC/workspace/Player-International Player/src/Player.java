
public class Player {
	String name;
	String country;
	
	public Player(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	public void displayDetails() {
		System.out.printf("Player Details:\nPlayer name : %s\nCountry : %s\n", name, country);
	}
}
