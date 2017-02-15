import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String search;
		
		System.out.println("Enter the number of players");
		Scanner sc = new Scanner(System.in);
		HashMap<String, Player> players = new HashMap<>();
		
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			System.out.printf("Enter the details of the player %d\n", ++i);
			players.put(sc.nextLine(), new Player(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		
		System.out.println("Enter the jersy number to be searched");
		search = sc.nextLine();
		sc.close();
		if(players.containsKey(search)) {
			System.out.println(players.get(search));
		} else {
			System.out.println("Player not found");			
		}
	}

}
