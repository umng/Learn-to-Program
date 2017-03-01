
public class Team {
	int id;
	String name;
	String coach;
	City homeCity;
	int captain;
	
	//CONTRUCTOR
	public Team(String name,String coach,City homeCity,int captain)
	{
		this.setName(name);
		this.setCoach(coach);
		this.setHomeCity(homeCity);
		this.setCaptain(captain);
	}
	
	//SETTERS
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCoach(String coach)
	{
		this.coach=coach;
	}
	
	public void setHomeCity(City homeCity)
	{
		this.homeCity=homeCity;
	}
	
	public void setCaptain(int captain)
	{
		this.captain=captain;
	}
	
	//GETTERS
	public int getId()
	{
		return id;
	}
	
	public int getCaptain()
	{
		return captain;
	}
	
	public City getHomeCity()
	{
		return homeCity;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCoach()
	{
		return coach;
	}
}
