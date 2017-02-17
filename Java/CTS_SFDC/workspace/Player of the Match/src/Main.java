import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		int p;
		Scanner sc = new Scanner(System.in);
		
		TreeSet<String> players = new TreeSet<>();
		
		p = sc.nextInt();
		sc.nextLine();
		for(int i=0; i< p; i++	) {
			players.add(sc.nextLine());
		}
		sc.close();
		
		for(String s : players) {
			System.out.println(s);
		}
		
	}

}
