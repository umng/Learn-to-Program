import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m, frequency = 0;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> scores = new ArrayList<>();

		System.out.println("Enter the number of matches");
		m = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the runs scored by the team");
		for(int i = 0; i< m; i++) {
			scores.add(sc.nextInt());
		}
		sc.close();
		
//		for(int score : scores) {
//			if(score%2 == 1)
//				frequency++;
//		}
		
		frequency = Collections.frequency(scores, new Main() {
		    @Override
		    public boolean equals(Object another) {
		    	int x = (int) another;
		    	if(x <= 2 && x >= 0)
		    		return true;
		    	for(int i = 2; i < x; i++) {
			        if (x%i == 0) 
			        	return false;
		    	}
		    	return true;
		    }
		});
		
		System.out.print("Number of prime scores : " + frequency);
	}

}
