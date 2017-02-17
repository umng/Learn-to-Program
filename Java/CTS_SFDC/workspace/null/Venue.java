  public class Venue {
    private
    
	String name;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Venue(String name, String city) {
	
		this.name = name;
		this.city = city;
	}
	public String toString()
	{
		String s=getName()+","+getCity();
		return s;
		
	}
}


