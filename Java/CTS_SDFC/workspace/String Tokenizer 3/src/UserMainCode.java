import java.util.StringTokenizer;

public class UserMainCode {
	public static void display(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "\n");
		}
	}
}
