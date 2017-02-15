import java.util.ArrayList;
import java.util.List;

public class Scores extends Thread {
	String scoreType;
	Integer start;
	Integer end;
	List<Integer> scoreList;
	
	public Scores(String scoreType, Integer start, Integer end) {
		super();
		this.scoreType = scoreType;
		this.start = start;
		this.end = end;
		scoreList = new ArrayList<>();
	}
	
	void display() {
		for(Integer i : scoreList) {
			System.out.print(i + " ");
		}
	}
	
	@Override
	public void run() {
		if(scoreType.equals("Odd")) {
			for(int i = start; i <=end; i++) {
				if(i%2 == 1) {
					scoreList.add(i);
				}
			}
		} else if(scoreType.equals("Even")) {
			for(int i = start; i <=end; i++) {
				if(i%2 == 0) {
					scoreList.add(i);
				}
			}
		}
	}
}
