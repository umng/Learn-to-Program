import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		int fifties = 0, centuries = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			scores.add(sc.nextInt());
			i++;
		}
		sc.close();
		
		for(int s : scores) {
			if(s >= 100) {
				centuries++;
			} else if(s >= 50) {
				fifties++;
			}
		}
		
		System.out.println(fifties);
		System.out.println(centuries);
	}

}
