class Outcome {
    private
    String status ;
    String winnerTeam ;
    String playerOfMatch ;
    String date;
Outcome(){}
 Outcome(String date,String status,String winnerTeam,String playerOfMatch)
 {
  this.date=date;
  this.status=status;
  this.winnerTeam=winnerTeam;
  this.playerOfMatch=playerOfMatch;
 }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getWinnerTeam() {
        return winnerTeam;
    }
    public void setWinnerTeam(String winnerTeam) {
        this.winnerTeam = winnerTeam;
    }
    public String getPlayerOfMatch() {
        return playerOfMatch;
    }
    public void setPlayerOfMatch(String playerOfMatch) {
        this.playerOfMatch = playerOfMatch;
    }
    
    
    
    void setDate(String date)
 {
  this.date=date;
 }

 String getDate()
 {
  return date;
 }
    

public String toString()
 {
  return String.format("%-20s %-20s %-20s %s",status,winnerTeam,playerOfMatch,date);
 }
    

}

