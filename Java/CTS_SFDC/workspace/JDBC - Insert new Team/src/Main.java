
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.List;


public class Main {
  
  public static void main(String ags[])throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String name, coach;

    
      System.out.println("Enter team name");
      name = br.readLine();
      System.out.println("Enter coach name");
      coach = br.readLine();
  
    
      System.out.println("Enter the city");
      System.out.println("1.Pune");
      System.out.println("2.Hyderabad");
      System.out.println("3.Delhi");
      Integer choice = Integer.parseInt(br.readLine());
      City cityIns = null;
      CityDAO role = new CityDAO();
      List<Team> teamList = null;
      TeamDAO teamIns = new TeamDAO();
      
      String cityName = "";
      if(choice==1)	cityName="Pune";
      else if(choice == 2) cityName="Hyderabad";
      else if(choice == 3) cityName="Delhi";  
      cityIns = role.getCityByName(cityName);  
      teamIns.createTeam(new Team(name, coach, cityIns));
      
      teamList = teamIns.getAllTeams();
      
      System.out.println("Team Details are:"); 
      System.out.println(String.format("%-35s%-35s%-15s", "Name", "Coach","City"));
      
      for(Team t : teamList) { 
          System.out.println(String.format("%-35s%-35s%-15s", t.getName(), t.getCoach(), t.getCity().getCityName()));
      }  
      
      
  }
  
      
}
