

public class Player {
	int id;
	String name;
	String country;
	Skill skill;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	public Player(int id, String name, String country, Skill skill) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
}
