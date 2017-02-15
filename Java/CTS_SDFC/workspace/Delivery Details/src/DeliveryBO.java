  public class DeliveryBO {
    
	void displayAllDeliveryDetails(Delivery[] deliveryList)
	{
		System.out.println("Delivery Details");
		int i = 1;
		for(Delivery d : deliveryList) {
			System.out.println("Delivery--" + (i++));
			System.out.println(d);
		}
	}

}


