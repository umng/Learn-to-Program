import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Song {
	String name;
	String artist;
	String duration;
	
	public Song(String name, String artist, String duration) {
		super();
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	@XmlElement
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getDuration() {
		return duration;
	}
	@XmlElement
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
