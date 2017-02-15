
public class CalculateScores implements Runnable {
	String matchType;
	String scoreString;
	Integer[] scores;
	Double meanScore;
	Integer minScore;
	Integer maxScore;
	
	public CalculateScores(String matchType, String scoreString) {
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

	public Double getMeanScore() {
		return meanScore;
	}

	public void setMeanScore(Double meanScore) {
		this.meanScore = meanScore;
	}

	public Integer getMinScore() {
		return minScore;
	}

	public void setMinScore(Integer minScore) {
		this.minScore = minScore;
	}

	public Integer getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Integer maxScore) {
		this.maxScore = maxScore;
	}
	
	@Override
	public void run() {
		String[] parts = scoreString.split(",");
		int i = 0, total = 0;
		maxScore = 0;
		minScore = 1000;
		scores = new Integer[parts.length];
		while(i < parts.length) {
			scores[i] = Integer.parseInt(parts[i]);
			total += scores[i];
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
			if(scores[i] < minScore) {
				minScore = scores[i];
			}
			meanScore = ((double) total) / parts.length;
			i++;
		}
	}
}
