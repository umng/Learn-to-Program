import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		m = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< m; i++) {
			scores.add(sc.nextInt());
		}
		sc.close();
		
		for(int s : scores) {
			System.out.println(s);
		}
	}

}
