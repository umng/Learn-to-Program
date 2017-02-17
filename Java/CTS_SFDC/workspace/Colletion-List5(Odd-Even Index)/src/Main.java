import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> scores = new ArrayList<>();
		
		m = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< m; i++) {
			scores.add(sc.nextInt());
		}
		sc.close();
		
		for(Integer i : scores) {
			if(i%2==0 && scores.indexOf(i)%2==0) {
				sum += i;
			} else if(i%2==1 && scores.indexOf(i)%2==1) {
				sum += i;
			}
		}
		
		System.out.print(sum);
	}

}
