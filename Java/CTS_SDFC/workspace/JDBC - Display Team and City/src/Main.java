
import java.util.List;

public class Main {
    public static void main(String ags[])throws Exception{
        System.out.println("List of all team and their city"); 
        System.out.println(String.format("%-15s%-30s%-30s%-15s","Id", "Name", "Coach","CityName"));
        List<Team> teamList = null;
        TeamDAO teamIns = new TeamDAO();
 
        teamList = teamIns.getAllTeams();
        
        for(Team t : teamList) { 
            System.out.println(String.format("%-15d%-30s%-30s%-15s",t.getTeamId(), t.getName(), t.getCoach(), t.getCity().getCityName()));
        }  
    }
}
