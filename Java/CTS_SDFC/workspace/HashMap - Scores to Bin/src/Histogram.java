import java.util.HashMap;

public class Histogram {
	private HashMap<Integer,Integer> bins;
	
	public Histogram() {
		bins = new HashMap<>();
		bins.put(10, 0);
		bins.put(20, 0);
		bins.put(30, 0);
		bins.put(40, 0);
	}

	public void addScore(Integer i) {
		if(i>0 && i <=10) {
			bins.put(10, bins.get(10) + 1);
		} else if(i>10 && i <=20) {
			bins.put(20, bins.get(20) + 1);			
		} else if(i>20 && i <=30) {
			bins.put(30, bins.get(30) + 1);			
		} else if(i>30 && i <=40) {
			bins.put(40, bins.get(40) + 1);			
		}
	}
	
	public void displayHistogram() {
		System.out.printf("Histogram\n10 : %s\n20 : %s\n30 : %s\n40 : %s",
				getStars(bins.get(10)), getStars(bins.get(20)), getStars(bins.get(30)), getStars(bins.get(40)));
	}
	
	private String getStars(int i) {
		String s = "";
		while(i>0) {
			s += "*";
			i--;
		}
		return s;
	}
}
