
public class TitleCaseThread implements Runnable {
	String outcome;
	String modifiedSummary;
	
	public TitleCaseThread(String outcome) {
		super();
		this.outcome = outcome;
	}

	public String getModifiedSummary() {
		return modifiedSummary;
	}

	@Override
	public void run() {
		modifiedSummary = toTitleCase(outcome);
	}
	
	private String toTitleCase(String outcome) {
		String s = "";
		boolean flag = true;
		for(char c : outcome.toCharArray()) {
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
