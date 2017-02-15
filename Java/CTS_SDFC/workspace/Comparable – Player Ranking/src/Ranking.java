
public class Ranking implements Comparable<Ranking> {
	String name;
	long score;
	
	public Ranking(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Ranking o) {
		return (int) (o.getScore() - this.getScore());
	}
}
