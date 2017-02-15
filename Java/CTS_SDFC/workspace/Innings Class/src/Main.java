import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Innings d = new Innings();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the innings number");
		d.number = sc.nextLine();
		System.out.println("Enter the BattingTeam");
		d.battingTeam = sc.nextLine();
		System.out.println("Enter the runs scored");
		d.runs = sc.nextLong();
		sc.close();
		
		d.displayInningsDetails();
	}

}
