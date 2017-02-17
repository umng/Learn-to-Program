import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static <T> void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> scores = new TreeSet<>();
		
		n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			scores.add(sc.nextInt());
		}
		
		for(int s : scores) {
			System.out.println(s);
		}
	}

}
