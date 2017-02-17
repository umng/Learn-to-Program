class PlayerBO {
    void displayAllPlayerDetails(Player[] playerList) {
		System.out.println("Player Details");
		for(Player p : playerList) {
			System.out.println(p);	
		}
  	}
    void displaySpecificPlayerDetails(Player[] playerList,String countryName)
	{
		System.out.println("Player Details");
		for(Player p : playerList) {
			if(countryName.equals(p.getCountry())) {
				System.out.println(p);
			}
		}
	}

}
