import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, n;
		String className;
		int id, marks;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> classList = new HashMap<>();
		HashMap<Integer, Integer> marksList = new HashMap<>();
		
		n = sc.nextInt();
		sc.nextLine();
		
		while(i < n) {
			id = sc.nextInt();
			sc.nextLine();
			className = sc.nextLine();
			marks = sc.nextInt();
			classList.put(id, className);
			marksList.put(id, marks);
			i++;
		}
		sc.close();

		marksList = UserMainCode.increaseMarks(classList, marksList);
		
		for(Map.Entry<Integer, Integer> m : marksList.entrySet()) {
			System.out.printf("%d\n%d\n", m.getKey(), m.getValue());
		}
	}
}
