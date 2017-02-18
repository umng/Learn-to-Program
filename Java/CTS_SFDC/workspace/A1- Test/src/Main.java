import java.util.*; class Main { 
	public static void main(String args[]) { 
		List<Integer> list = new ArrayList<Integer>(); 
		ListIterator a = list.listIterator(); 
		if(a.previousIndex()!= -1) 
			while(a.hasNext()) System.out.print(a.next() + " "); 
		else System.out.print("EMPTY"); } }