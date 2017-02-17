import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Integer start;
		Integer end;
		System.out.println("Enter range of numbers");
		Scanner sc = new Scanner(System.in);
		
		start = Integer.parseInt(sc.nextLine());
		end = Integer.parseInt(sc.nextLine());
		sc.close();

		Scores odd = new Scores("Odd", start, end);
		odd.start();
		Scores even = new Scores("Even", start, end);
		even.start();
		
		try{  
			odd.join();
			even.join();
		}catch(Exception e){
		}  
		
		System.out.println("Odd numbers in given range");
		odd.display();
		System.out.println("\nEven numbers in given range");
		even.display();
	}

}
