import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Character, Integer> chars = new TreeMap<>();
		
		System.out.println("Enter the input string");
		char[] ch = sc.nextLine().toCharArray();
		sc.close();
		
		for(char c : ch) {
			if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				if(chars.containsKey(c))
					chars.put(c, chars.get(c) + 1);
				else
					chars.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : chars.entrySet()) {
			System.out.printf("%c : %s\n", m.getKey(), getStars(m.getValue()));
		}
				
	}
	
	private static String getStars(int i) {
		String s = "";
		while(i>0) {
			s += "*";
			i--;
		}
		return s;
	}

}
