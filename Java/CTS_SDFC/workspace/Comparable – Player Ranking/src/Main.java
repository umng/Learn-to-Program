import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String name;
		long score;
		Scanner sc = new Scanner(System.in);
		ArrayList<Ranking> rankings = new ArrayList<>();
		
		System.out.println("Please provide the number of  players");
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			i++;
			System.out.println("Enter the name of the player " + i);
			name = sc.nextLine();
			System.out.println("Enter the score of the player " + i);
			score = Long.parseLong(sc.nextLine());
			rankings.add(new Ranking(name, score));
		}
		sc.close();
		
		Collections.sort(rankings);

		System.out.println("Player Details by Score(High to Low)");
		i = 0;
		for(Ranking t : rankings) {
			System.out.println( (++i) + " " + t.getName() + " " + t.getScore());
		}
	}

}
