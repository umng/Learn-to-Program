import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m, total = 0;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		m = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< m; i++) {
			scores.add(sc.nextInt());
		}
		sc.close();
		
		for(int s : scores) {
			total += s;
		}
		
		System.out.println(total);
		System.out.printf("%.1f", (float)total/m);
	}

}
