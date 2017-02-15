import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		int i = 0;
		List<Match> matches = new ArrayList<>();
		MatchFileStore mfs = new MatchFileStore();
		InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("matches.txt")));
		matches = mfs.obtainMatchFromFile(isr);
		
		System.out.println("The Match Details are :");
		for(Match m : matches) {
			m.displayMatch(m, ++i);
		}
	}

}
