import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MatchFileStore {
	List<Match> obtainMatchFromFile(InputStreamReader isr) throws IOException {
		String s = "";
		int i;
		List<Match> matches = new ArrayList<>();
		boolean flag = false;
		while((i = isr.read()) != -1) {
			if(flag) {
				matches.add(getMatch(s));
				s = "";
				s += (char) i;
				flag = false;
			} else {
				if( (char)i == '\n') {
					flag = true;
				} else {
					s += (char) i;
				}
			}
		}
		matches.add(getMatch(s));
		isr.close();
		
		return matches;
	}
	
	private Match getMatch(String s) {	
		String teamOne = s.substring(0, s.indexOf(' '));
		s = s.substring(s.indexOf(' '), s.length()).trim();
		String teamTwo = s.substring(0, s.indexOf(' '));
		s = s.substring(s.indexOf(' '), s.length()).trim();
		String matchDate = s.substring(s.lastIndexOf(' '), s.length());
		s = s.substring(0, s.lastIndexOf(' '));
		String venue = s;
		return new Match(teamOne.trim(), teamTwo.trim(), venue.trim(), matchDate.trim());
	}
}
