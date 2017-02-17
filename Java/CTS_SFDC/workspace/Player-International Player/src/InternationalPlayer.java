
public class InternationalPlayer extends Player {
	String capNumber;
	Long noOfTestAppearance;
	Long noOfODIAppearance;
	
	public InternationalPlayer(String name, String country, String capNumber, Long noOfTestAppearance,
			Long noOfODIAppearance) {
		super(name, country);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.printf("Cap number : %s\nNumber of test appearnace : %d\nNumber of ODI appearnace : %d ", capNumber, noOfTestAppearance, noOfODIAppearance);
	}
}
