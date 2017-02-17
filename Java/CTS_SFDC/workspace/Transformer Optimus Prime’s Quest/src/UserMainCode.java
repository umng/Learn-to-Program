
public class UserMainCode {
	public static String getPosition(int l, String s) {
		int x = 0, y = 0;
		for(int i=0; i<l; i++) {
			if(s.charAt(i) == 'L')
				x--;
			else if(s.charAt(i) == 'R')
				x++;
			else if(s.charAt(i) == 'D')
				y--;
			else if(s.charAt(i) == 'U')
				y++;
		}
		return x + " " + y;
	}
}
