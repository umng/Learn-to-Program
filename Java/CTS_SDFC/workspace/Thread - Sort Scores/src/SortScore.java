import java.util.Arrays;

public class SortScore extends Thread {
	String matchType;
	String scoreString;
	Integer[] scores;
	
	public SortScore(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	
	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getScoreString() {
		return scoreString;
	}

	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}

	public Integer[] getScores() {
		return scores;
	}

	public void setScores(Integer[] scores) {
		this.scores = scores;
	}

	@Override
	public void run() {
		String[] parts = scoreString.split(",");
		int i = 0;
		scores = new Integer[parts.length];
		while(i < parts.length) {
			scores[i] = Integer.parseInt(parts[i]);
			i++;
		}
		Arrays.sort(scores);
	}
}
