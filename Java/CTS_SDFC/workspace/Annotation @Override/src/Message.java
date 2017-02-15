
public class Message {
	String from, to, message;

	public Message(String from, String to, String message) {
		super();
		this.from = from;
		this.to = to;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message sent successfully\nsender : " + this.from + "\nreceiver : " + this.to + "\nmessage : " + this.message;
	}
}
