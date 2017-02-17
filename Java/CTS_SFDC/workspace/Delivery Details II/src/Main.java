
  import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        Long over;
    Long ball;
    Long runs; 
    String  batsman;
    String  bowler;
    String  nonStriker;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of deliveries");
int n=Integer.parseInt(br.readLine());
  Delivery[] delivery=new Delivery[n];
for(int i=0;i<n;i++)
        {
        System.out.println("Enter the over");
        over=Long.parseLong(br.readLine());
        

        System.out.println("Enter the ball");
        ball=Long.parseLong(br.readLine());
        

        System.out.println("Enter the runs");
        runs=Long.parseLong(br.readLine());
        

        System.out.println("Enter the batsman name");
        batsman=br.readLine();
        

        System.out.println("Enter the bowler name");
        bowler=br.readLine();
    

        System.out.println("Enter the nonStriker name");
        nonStriker=br.readLine();
	

        delivery[i] = new Delivery(over,ball,runs,batsman,bowler,nonStriker);
        
}
System.out.println("Enter your choice\n1.View delivery details\n2.Batsman and Bowler\n3.Maximum runs");
int ch=Integer.parseInt(br.readLine());
DeliveryBO dBo=new DeliveryBO();
switch(ch)
{
case 1:
dBo.displayAllDeliveryDetails(delivery);
break;
case 2:
System.out.println("Enter the over for which batsman and bowler to be known");
Long oversearch=Long.parseLong(br.readLine());
System.out.println("Enter the ball for which batsman and bowler to be known");
Long ballsearch=Long.parseLong(br.readLine());
dBo.displayBatsmanBowlerDetails(delivery,ballsearch,oversearch);
break; 
case 3:
dBo.displayMaximumRunDetails(delivery);  
break;
}
    }
}




