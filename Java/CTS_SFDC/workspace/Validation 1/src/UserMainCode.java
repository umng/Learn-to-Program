
public class UserMainCode {
	public static boolean validatePlayer(String firstName, String lastName) {
		boolean valid = true;
		
		for(int i = 0; i < firstName.length() - 1; i++) {
			if(i%2!=0 && firstName.charAt(i) != '*') {
				valid = false;
				break;
			}
		}

		
		for(int i = 0; i < lastName.length() - 1; i++) {
			if(i%2!=0 && lastName.charAt(i) != '#') {
				valid = false;
				break;
			}
		}
		
		return valid;
	}
}
