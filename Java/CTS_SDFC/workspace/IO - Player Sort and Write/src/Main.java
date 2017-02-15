import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		ArrayList<Player> players = new ArrayList<>();
		FileUtility fu = new FileUtility();
		players = fu.readFileData(br);
		Collections.sort(players);
		fu.writeDataToFile(players);	
	}

}
