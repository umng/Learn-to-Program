import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String from, to, message;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("From Number :");
		from = sc.nextLine();
		System.out.println("To Number :");
		to = sc.nextLine();
		System.out.println("Text Message :");
		message = sc.nextLine();
		sc.close();
		
		Message m = new Message(from, to, message);
		System.out.print(m);
	}

}
