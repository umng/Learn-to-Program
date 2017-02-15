  import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String battingTeam;	
		Long runs;
		
		Innings [] innings=new Innings[2];
		InningsBO inningsBO=new InningsBO();
		
		System.out.println("Enter the values for FirstInnings");
		System.out.println("Enter the BattingTeam");
		battingTeam=br.readLine();
		System.out.println("Enter the runs scored");
		runs=Long.parseLong(br.readLine());
		innings[0]=new Innings(battingTeam,runs);
		
		
		System.out.println("Enter the values for SecondInnings");
		System.out.println("Enter the BattingTeam");
		battingTeam=br.readLine();
		System.out.println("Enter the runs scored");
		runs=Long.parseLong(br.readLine());
		innings[1]=new Innings(battingTeam,runs);
		inningsBO.displayAllInningsDetails(innings);
		
		
	}

}



