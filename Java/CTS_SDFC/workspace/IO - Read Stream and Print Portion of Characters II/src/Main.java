import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int start, end;
		FileInputStream fis = new FileInputStream("matchsummary.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		
		start = Integer.parseInt(sc.nextLine());
		end = Integer.parseInt(sc.nextLine());
		sc.close();
		
		int i;
		br.skip(start - 1);
		end = end-start;
		while((i = br.read()) != -1) {
			if((end--) < 0)
				break;
			System.out.print((char)i);
		}
		br.close();
	}

}
