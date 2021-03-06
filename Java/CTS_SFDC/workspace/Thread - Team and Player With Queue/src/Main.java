import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws InterruptedException {
		Integer numberOfPlayers;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Players");
		numberOfPlayers = Integer.parseInt(sc.nextLine());
		sc.close();
		
		Main m = new Main();

		TeamThread tt = new TeamThread(m, numberOfPlayers);
		PlayerThread pt = new PlayerThread(m, numberOfPlayers);
		
		tt.start();
		pt.start();
		
		tt.join();
		pt.join();
	}

}
