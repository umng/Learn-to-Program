class Wicket
{
private Long over,ball;
private String wicketType,playerName,bowlerName;
Wicket(){}
Wicket(Long over,Long ball,String wicketType,String playerName,String bowlerName)
{
this.over=over;
this.ball=ball;
this.wicketType=wicketType;
this.playerName=playerName;
this.bowlerName=bowlerName;
}
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
public void setWicketType(String wicketType) {
      this.wicketType = wicketType;
   }
   public String getWicketType() {
      return wicketType;
   }
public void setPlayerName(String playerName) {
      this.playerName = playerName;
   }
   public String getPlayerName() {
      return playerName;
   }
public void setBowlerName(String bowlerName) {
      this.bowlerName = bowlerName;
   }
   public String getBowlerName() {
      return bowlerName;
   }

public String toString()
    {
        
        return String.format("Over:%s\nBall:%s\nWicket Type:%s\nPlayer Name:%s\nBowler Name:%s",over,ball,wicketType,playerName,bowlerName);


    }
}
