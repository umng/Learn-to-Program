import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String id;
		int theory, lab;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> theoryList = new HashMap<>();
		HashMap<String, Integer> labList = new HashMap<>();
		TreeMap<String, String> gradeList = new TreeMap<>();
		
		n = sc.nextInt();
		sc.nextLine();
		
		while(i < n) {
			id = sc.nextLine();
			theory = sc.nextInt();
			sc.nextLine();
			lab = sc.nextInt();
			if(!(i==n-1))
				sc.nextLine();
			theoryList.put(id, theory);
			labList.put(id, lab);
			i++;
		}
		sc.close();

		gradeList = UserMainCode.calculateGrades(labList, theoryList);
		
		for(Entry<String, String> m : gradeList.entrySet()) {
			System.out.printf("%s\n%s\n", m.getKey(), m.getValue());
		}
	}

}
