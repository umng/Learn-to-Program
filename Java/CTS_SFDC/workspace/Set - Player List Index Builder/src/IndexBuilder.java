import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class IndexBuilder {
	public TreeSet<Index> buildIndex(HashSet<Player> players) {
		TreeSet<Index> indexes = new TreeSet<>();
		
		Iterator<Player> iterator = players.iterator();
		while(iterator.hasNext()) {
			Player p = iterator.next();
			Index i = findIndex(indexes, p.getName().charAt(0));
			if(i == null) {
				indexes.add(new Index(p.getName().charAt(0), 1));
			} else {
				indexes.remove(i);
				indexes.add(new Index(p.getName().charAt(0), i.getCount() + 1));
			}
		}
		return indexes;
	}
	
	private Index findIndex(TreeSet<Index> indexes,char ch) {
		Iterator<Index> iterator = indexes.iterator();
		while(iterator.hasNext()) {
			Index i = iterator.next();
			if(i.getCh() == ch)
				return i; 
		}
		return null; 
	}
	
	public void displayIndex(TreeSet<Index> indexes) {
		System.out.print(String.format("%-14s%-15s","Player", "Index")); 
		Iterator<Index> iterator = indexes.iterator();
		while(iterator.hasNext()) {
			Index i = iterator.next();
			System.out.print(String.format("\n%-15s%-15d",i.getCh(), i.getCount())); 
		} 
	}
}
