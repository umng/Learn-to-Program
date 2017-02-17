import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int i = 0, n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of lines in the outcome");
		n = Integer.parseInt(sc.nextLine());
		TitleCaseThread[] tct = new TitleCaseThread[n];
		Thread[] t = new Thread[n];
		
		while(i < n) {
			tct[i] = new TitleCaseThread(sc.nextLine());
			t[i] = new Thread(tct[i]);
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
		
		i = 0;
		for(TitleCaseThread tc : tct) {
			System.out.println("Sentence " + (++i) + " : " + tc.getModifiedSummary());
		}
	}

}
