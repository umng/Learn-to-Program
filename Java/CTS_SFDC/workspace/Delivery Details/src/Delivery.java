  public class Delivery {
    private
    Long over;
	Long ball;
	String batsman;
	String  bowler;
	String  nonStriker;
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	public Delivery(Long over, Long ball, String batsman, String bowler,
			String nonStriker) {

		this.over = over;
		this.ball = ball;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	public String toString()
	{
		return String.format("Over :"+getOver()+"\nBall :"+getBall()+"\nBatsman :"+getBatsman()+"\nBowler :"+getBowler()+"\nNonStriker :"+getNonStriker());
		
	}

}


