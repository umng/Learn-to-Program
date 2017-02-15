import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double sr;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strike rate:");
		sr = sc.nextDouble();
		sc.close();

		System.out.printf("The Strike rate of Dhoni is %.2f", Float.parseFloat(sr.toString()));
	}

}
