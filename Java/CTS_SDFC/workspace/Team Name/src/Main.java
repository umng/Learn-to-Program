import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		sc.close();
		s = new StringBuilder(s).reverse().toString();
		for(char c : s.toCharArray()) {
			System.out.println(c);
		}
	}

}
