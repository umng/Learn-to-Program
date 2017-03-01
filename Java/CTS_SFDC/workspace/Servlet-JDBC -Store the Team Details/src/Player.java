
public class Player {
	int id;
	String name;
	Team team;
	
	//CONSTRUCTOR
	public Player(int id,String name,Team team)
	{
		this.setId(id);
		this.setName(name);
		this.setTeam(team);
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
	
	public void setTeam(Team team)
	{
		this.team=team;
	}
	
	//GETTERS
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Team getTeam()
	{
		return team;
	}
}
