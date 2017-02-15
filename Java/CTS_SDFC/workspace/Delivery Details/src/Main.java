  import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long over;
		Long ball;
		String batsman;
		String  bowler;
		String  nonStriker;
		Integer n;
		System.out.println("Enter the number of deliveries");
		n=Integer.parseInt(br.readLine());
		Delivery [] delivery=new Delivery[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the over");
			over=Long.parseLong(br.readLine());
			System.out.println("Enter the ball");
			ball=Long.parseLong(br.readLine());
			System.out.println("Enter the batsman");
			batsman=br.readLine();
			System.out.println("Enter the bowler");
			bowler=br.readLine();
			System.out.println("Enter the nonStriker");
			nonStriker=br.readLine();
			delivery[i]=new Delivery(over,ball,batsman,bowler,nonStriker);	
		}
		DeliveryBO deliveryBO=new DeliveryBO();
		deliveryBO.displayAllDeliveryDetails(delivery);
		
	}

}


