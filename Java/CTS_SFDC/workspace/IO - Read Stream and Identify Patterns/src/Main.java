import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int i = 0, n;
		String s = "";
		Scanner sc = new Scanner(System.in);
		ArrayList<String> search = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("team.txt"));
		
		System.out.println("Enter number of words");
		n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the strings to be searched");
		while(i < n) {
			search.add(sc.nextLine());
			i++;
		}
		sc.close();

		while((i = br.read()) != -1) {
			s += (char)i;
		}
		br.close();
		System.out.println("Given string is " + s);
		for(String sr : search) {
			System.out.println("Word:" + sr + " Count:" + getNoOfPatterns(s, sr));
		}
	}
	
	private static int getNoOfPatterns(String s, String search) {
		int i = 0, x = 0;
		while(x != -1) {
			x = s.indexOf(search, x);
			if(x != -1) {
				i++;
				x += search.length();
			}
		}
		return i;
	}

}
