class DeliveryBO
{
	DeliveryBO(){}
	void displayAllDeliveryDetails(Delivery[] deliveryList)
	{
		System.out.printf("Delivery Details\n%-20s %-20s %-20s %-20s %-20s %s\n", "Over", "Ball", "Runs", "Batsman", "Bowler", "NonStriker");
		for(Delivery d : deliveryList)
			System.out.println(d);
	}
	void displayBatsmanBowlerDetails(Delivery[] deliveryList, long ball,long over)
	{
		for(Delivery d : deliveryList) {
			if(d.getBall() == ball && d.getOver() == over) {
				System.out.printf("Batsman : %s\nBowler : %s", d.getBatsman(), d.getBowler());
				break;
			}
		}
	}
	
	void displayMaximumRunDetails(Delivery[] deliveryList)
	{
		long max = 0;
		for(Delivery d : deliveryList) {
			if(d.getRuns() > max) {
				max = d.getRuns();
			}
		}
		for(Delivery d : deliveryList) {
			if(d.getRuns() == max ) {
				System.out.printf("Maximum Runs : %d\nOver : %d\nBall : %d", d.getRuns(), d.getOver(), d.getBall());
				break;
			}
		}
	}

}
