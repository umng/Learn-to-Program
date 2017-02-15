import java.util.HashMap;
import java.util.Map;

public class UserMainCode {
	public static HashMap<Integer, Integer> increaseMarks(HashMap<Integer, String> stuClassMap, HashMap<Integer, Integer> stuMarkMap) {
		HashMap<Integer, Integer> stuMarks = new HashMap<>();
		for(Map.Entry<Integer, String> m : stuClassMap.entrySet()) {
			if(m.getValue().equals("BE-CSE")) {
				stuMarks.put(m.getKey(), stuMarkMap.get(m.getKey()) + 5);
			}
		}
		return stuMarks;
	}
	
}
