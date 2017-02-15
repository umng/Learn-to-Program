import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int p;
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> players = new HashSet<>();
		
		p = sc.nextInt();
		sc.nextLine();
		sc.close();
		for(int i=0; i< p; i++	) {
			players.add(sc.nextLine());
		}
		
		System.out.print(players.size());
	}

}
