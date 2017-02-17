
public class Player {
	String name;
	String skill;
	
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj.hashCode() == this.hashCode())
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		int hash=0;
		char[] ch = this.getName().toCharArray();
		for(int i = 1; i <= ch.length; i++) {
			hash += ((int) ch[i - 1])*(i++);
		}
		return hash;
	}
}
