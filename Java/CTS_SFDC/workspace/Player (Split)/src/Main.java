import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the player details");
		s = sc.nextLine();
		sc.close();
		
		String[] parts = s.split(",");
		Player p = new Player();
		p.name = parts[0];
		p.country = parts[1];
		p.skill = parts[2];
		
		System.out.printf("Player Details :\nPlayer Name : %s\nCountry Name : %s\nSkill : %s", p.name, p.country, p.skill);
	}

}
