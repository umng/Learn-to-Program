import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int i = 0, n = 3;
		String matchType;
		String scoreString;
		Scanner sc = new Scanner(System.in);
		CalculateScores[] csList = new CalculateScores[3];
		Thread[] t = new Thread[3];
		
		while(i < n) {
			System.out.println("Enter the match :");
			matchType = sc.nextLine();
			System.out.println("Enter the scores :");
			scoreString = sc.nextLine();
			csList[i] = new CalculateScores(matchType, scoreString);
			t[i] = new Thread(csList[i]);
			t[i].start();
			i++;
		}
		sc.close();
		try{  
			for(Thread th : t) {
				th.join();
			}  
		}catch(Exception e){
		}  
		
		System.out.println("Score Summary");
		for(CalculateScores ss : csList) {
			System.out.println("Match : " + ss.getMatchType());
			System.out.println( String.format("Mean : %.2f", ss.getMeanScore().floatValue()));
			System.out.println("Min Score : " + ss.getMinScore());
			System.out.println("Max Score : " + ss.getMaxScore());
		}
	}

}
