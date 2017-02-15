import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name, country, skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		name = sc.nextLine();
		System.out.println("Enter the country name");
		country = sc.nextLine();
		System.out.println("Enter the skill");
		skill = sc.nextLine();
		sc.close();
		
		Player p = new Player();
		p.name = name;
		p.country = country;
		p.skill = skill;
		
		System.out.print(
				"Player Details :"
				+"\nPlayer Name : " + p.name
				+ "\nCountry Name : " + p.country
				+ "\nSkill : " + p.skill
				);
	}

}
