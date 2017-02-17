import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> scores = new ArrayList<>();
		
		n = sc.nextInt();
		sc.nextLine();
		while(i < n) {
			scores.add(sc.nextLine());
			i++;
		}
		sc.close();
		
		for(String s : scores) {
			if(getFirstScore(s) == 0 && getSecondScore(s) == 0) {
				System.out.println(getName(s));
				flag = false;
			}
		}
		if(flag) {
			System.out.println("No player has scored a duck");			
		}
	}
	
	private static String getName(String s) {
		StringTokenizer st = new StringTokenizer(s, "-");
		return st.nextToken().toString();
	}
	
	private static int getFirstScore(String s) {
		StringTokenizer st = new StringTokenizer(s, "-");
		st.nextToken();
		return Integer.parseInt(st.nextToken());
	}
	
	private static int getSecondScore(String s) {
		StringTokenizer st = new StringTokenizer(s, "-");
		st.nextToken();
		st.nextToken();
		return Integer.parseInt(st.nextToken());
	}

}
