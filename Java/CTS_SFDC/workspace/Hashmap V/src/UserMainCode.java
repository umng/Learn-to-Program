import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UserMainCode {
	public static TreeMap<String, String> calculateGrades(HashMap<String, Integer> stuLabMark,HashMap<String, Integer> stuTheoMap) {
		TreeMap<String, String> gradeList = new TreeMap<>();
		for(Entry<String, Integer> m : stuLabMark.entrySet()) {
			if(m.getValue() > 80 && stuTheoMap.get(m.getKey()) > 80) {
				gradeList.put(m.getKey(), "A");
			} else if(m.getValue() > 80 || stuTheoMap.get(m.getKey()) > 80) {
				gradeList.put(m.getKey(), "B");
			} else {
				gradeList.put(m.getKey(), "C");
			}
		}
		
		return gradeList;
	}
}


