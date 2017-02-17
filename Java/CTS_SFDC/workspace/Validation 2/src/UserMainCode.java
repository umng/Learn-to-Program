
public class UserMainCode {
	public static boolean validateTeam(String s) {
		String[] teams = {"RCB", "MI", "CSK", "SRH", "KXIP", "DD", "KKR", "RPSG", "GL"};
		boolean valid = false;
		String teamCaption = s.substring(0, s.indexOf(" "));
		for(String team : teams) {
			if(teamCaption.equals(team)) {
				valid = true;
				break;
			}
		}
		
		try {
			@SuppressWarnings("unused")
			int jersey = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
		} catch(NumberFormatException ex) {
			valid = false;
		}
		
		return valid;
	}
}
