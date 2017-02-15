import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int p, x;
		String s = "";
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> players = new ArrayList<>();

		p = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < p; i++) {
			players.add(sc.nextLine());
		}
		
		do {
			System.out.println("Menu\n1.Insert Players\n2.Delete Players");
			x = sc.nextInt();
			sc.nextLine();
			String playerName = sc.nextLine();
			
			if(x == 1) {
				players.add(playerName);
				System.out.println("Player details after insertion");
			} else if(x == 2) {
				players.remove(players.indexOf(playerName));
				System.out.println("Player details after deletion");
			}

			for(String player : players) {
				System.out.println(player);
			}
			System.out.println("Do you want to continue");		
			s = sc.nextLine();	
		} while(s.equals("Yes"));
		sc.close();
	}

}
