import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the extratype details");
		s = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(s, "#");
		ExtraType e = new ExtraType();
		e.setName(st.nextToken());
		e.setRuns(Long.parseLong(st.nextToken()));
		
		System.out.printf("ExtraType Details\nExtra Type:%s\nRuns:%d", e.getName(), e.getRuns());
	}

}
