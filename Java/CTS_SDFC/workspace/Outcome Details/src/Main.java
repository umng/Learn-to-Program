import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    String date ;
        String status ;
        String winnerTeam ;
        String playerOfMatch ;
        System.out.println("Enter the number of matches");
       int n=Integer.parseInt(br.readLine());
        Outcome[] outcome=new Outcome[n];
for(int i=0;i<n;i++)
        {
System.out.println("Enter match "+(i+1)+" details");
	System.out.println("Enter the date");
        date=br.readLine();

        System.out.println("Enter the status");
        status=br.readLine();
        
        
        System.out.println("Enter the winner team");
        winnerTeam=br.readLine();
        
        
        System.out.println("Enter the player of match");
        playerOfMatch=br.readLine();
        outcome[i]=new Outcome(date,status,winnerTeam,playerOfMatch);
        
        }
OutcomeBO oBo=new OutcomeBO();
oBo.displayAllOutcomeDetails(outcome);
System.out.println("Enter the date to be searhed");
String sd=br.readLine();
oBo.displaySpecificOutcomeDetails(outcome,sd);
    }

}

    






