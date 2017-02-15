import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String country;
        String skill;
        Integer n;
        System.out.println("Enter the number of players");
        n=Integer.parseInt(br.readLine());
        Player [] player=new Player[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter the player name");
        name=br.readLine();
        System.out.println("Enter the country name");
        country=br.readLine();
        System.out.println("Enter the skill");
        skill=br.readLine();
        player[i]=new Player(name,country,skill);
        }
        PlayerBO playerBO=new PlayerBO();
        playerBO.displayAllPlayerDetails(player);

        System.out.println("Enter the country name for which players details to be known");
        String countryName=br.readLine();
        playerBO.displaySpecificPlayerDetails(player,countryName);
        
    }
    }






 


 
