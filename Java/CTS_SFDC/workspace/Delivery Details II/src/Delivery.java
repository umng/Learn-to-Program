class Delivery
{
private  
    Long over;
    Long ball;
    Long runs; 
    String  batsman;
    String  bowler;
    String  nonStriker;
    public void setOver(Long over) {
      this.over = over;
    }
    public Long getOver() {
    	return over;
    }
    
    public void setBall(Long ball) {
	     this.ball = ball;
	}
	public Long getBall() {
	     return ball;
	}
	   public void setRuns(Long runs) {
	      this.runs = runs;
	   }
	   public Long getRuns() {
	      return runs;
	   }
	
	   public void setBatsman(String batsman) {
	      this.batsman = batsman;
	   }
	   public String getBatsman() {
	      return batsman;
	   }
	
	   public void setBowler(String bowler) {
	      this.bowler = bowler;
	   }
	   public String getBowler() {
	      return bowler;
	   }
	
	public void setNonStriker(String nonStriker) {
	      this.nonStriker = nonStriker;
	   }
	   public String getNonStriker() {
	      return nonStriker;
	   }
	    Delivery() {
	    }
	    Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)
	    {
	        this.over=over;
	        this.ball=ball;
	        this.runs=runs;
	        this.batsman=batsman;
	        this.bowler=bowler;
	        this.nonStriker=nonStriker;
	    }
	
	public String toString()
	 {
	  return String.format("%-20s %-20s %-20s %-20s %-20s %s",over,ball,runs,batsman,bowler,nonStriker);
	 }
  
}
