class WicketBO 
{

	public WicketBO(){}
	void displayAllWicketDetails(Wicket[] wicketList) {
		int i = 1;
		System.out.println("Wicket Details");
		for(Wicket w : wicketList) {
			System.out.println("Wicket " + (i++));
			System.out.println(w);
		}
	}

	void displaySpecificWicketDetails(Wicket[] wicketList,String Type) {
		for(int i = 0; i < wicketList.length; i++) {
			if(Type.equals(wicketList[i].getWicketType())) {
				System.out.println("Wicket " + (i+1));
				System.out.println(wicketList[i]);
			}
		}
	}
}

