class OutcomeBO
{
OutcomeBO(){}
void displayAllOutcomeDetails(Outcome[] outcomeList) 
{
	System.out.println("Outcome Details");
	System.out.printf("%-20s %-20s %-20s %s\n", "Status", "Winning Team", "Player Of The Match", "Date");
	for(Outcome o : outcomeList) {
		System.out.println(o);
	}
}

void displaySpecificOutcomeDetails(Outcome[] outcomeList, String date)
{
	System.out.println("Outcome Details");
	System.out.printf("%-20s %-20s %-20s %s\n", "Status", "Winning Team", "Player Of The Match", "Date");
	for(Outcome o : outcomeList) {
		if(o.getDate().equals(date)) {
			System.out.println(o);
		}
	}
}

}
