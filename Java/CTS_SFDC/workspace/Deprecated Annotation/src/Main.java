import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base, power;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value");
		base = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the power value");
		power = sc.nextInt();
		sc.close();
		
		Calc c = new Calc();
		System.out.printf("Exponential : %d", c.exponential(base, power));
	}

}
