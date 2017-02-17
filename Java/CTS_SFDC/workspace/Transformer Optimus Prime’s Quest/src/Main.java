import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int l = 0;
		String s = "";
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		sc.nextLine();
		s = sc.nextLine();
		sc.close();
		if(l>=1 && l<=50) {
			System.out.println(UserMainCode.getPosition(l, s));
		}
	}

}
