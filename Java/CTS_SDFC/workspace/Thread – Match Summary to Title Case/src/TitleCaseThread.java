
public class TitleCaseThread implements Runnable {
	String summary;
	String modifiedSummary;
	
	public TitleCaseThread(String summary) {
		super();
		this.summary = summary;
	}

	public String getModifiedSummary() {
		return modifiedSummary;
	}

	@Override
	public void run() {
		modifiedSummary = toTitleCase(summary);
	}
	
	private String toTitleCase(String summary) {
		String s = "";
		boolean flag = true;
		for(char c : summary.toCharArray()) {
			if(flag) {
				s += String.valueOf(c).toUpperCase();
				flag = false;
			} else {
				s += String.valueOf(c).toLowerCase();
			}
			if(c == ' ') {
				flag = true;
			}
		}
		
		return s;
	}
}
