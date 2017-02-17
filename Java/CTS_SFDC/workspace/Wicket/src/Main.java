import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long over, ball;
		String wicketType, playerName, bowlerName;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the over");
		over = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ball");
		ball = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the wicket type");
		wicketType = sc.nextLine();
		System.out.println("Enter the player name");
		playerName = sc.nextLine();
		System.out.println("Enter the bowler name");
		bowlerName = sc.nextLine();
		sc.close();
		
		Wicket wicket = new Wicket();
		wicket.setOver(over);
		wicket.setBall(ball);
		wicket.setWicketType(wicketType);
		wicket.setPlayerName(playerName);
		wicket.setBowlerName(bowlerName);
		
		System.out.printf("Wicket Details\nOver : %d\nBall : %d\nWicket Type : %s\nPlayer Name : %s\nBowler Name : %s",
				wicket.getOver(), wicket.getBall(), wicket.getWicketType(), wicket.getPlayerName(), wicket.getBowlerName());
	}

}
