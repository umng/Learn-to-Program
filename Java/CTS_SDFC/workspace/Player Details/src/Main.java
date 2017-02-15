  
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
		String name, country, skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		name = sc.nextLine();
		System.out.println("Enter the country name");
		country = sc.nextLine();
		System.out.println("Enter the skill");
		skill = sc.nextLine();
		sc.close();
		
		Player p = new Player(name, country, skill);
		PlayerBO pb = new PlayerBO();
		pb.displayPlayerDetails(p);
	}

}


