import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Delivery d = new Delivery();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the over");
		d.over = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ball");
		d.ball = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the runs");
		d.runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		d.batsman = sc.nextLine();
		System.out.println("Enter the bowler name");
		d.bowler = sc.nextLine();
		System.out.println("Enter the nonStriker name");
		d.nonStriker = sc.nextLine();
		sc.close();
		
		d.displayDeliveryDetails();
	}

}
