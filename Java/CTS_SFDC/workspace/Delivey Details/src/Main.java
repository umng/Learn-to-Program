import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Long r;
		String bowler, batsman;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
		i = sc.nextInt();
		sc.nextLine();
		
		Delivery d = new Delivery();
		
		if(i == 1) {
			System.out.println("Enter the bowler name");
			bowler = sc.nextLine();
			System.out.println("Enter the batsman name");
			batsman = sc.nextLine();
			d.displayDeliveryDetails(bowler, batsman);
		} else if(i ==2) {
			System.out.println("Enter the number of runs");
			r = sc.nextLong();
			d.displayDeliveryDetails(r);
		}
		sc.close();
	}

}
