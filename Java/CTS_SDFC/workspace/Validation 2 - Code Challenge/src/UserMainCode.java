
public class UserMainCode {
	public static boolean validateTeam(String s) {
		int w = 0;
		try {
			w = Integer.parseInt(s.substring(s.length()-1));
		} catch(Exception e) {
			return false;
		}
		if(w > 0) {
			try {
				@SuppressWarnings("unused")
				int y = Integer.parseInt(s.substring(0, 4));
				int l = s.substring(5, s.length() - 1).length();
				if( !(l > 4 && l<20)) {
					return false;
				}
			} catch(Exception e) {
				return false;
			}
		} else {
			int l = s.substring(0, s.length() - 1).length();
			if( !(l > 4 && l<20)) {
				return false;
			}
		}
		
		return true;
	}
}
