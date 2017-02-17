import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		int score;
		Scanner sc = new Scanner(System.in);
		Histogram hg = new Histogram();
		
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			score = sc.nextInt();
			hg.addScore(score);
			i++;
		}
		sc.close();
		hg.displayHistogram();
	}

}
