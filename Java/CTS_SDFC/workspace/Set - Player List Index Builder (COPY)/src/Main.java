import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("");
		HashSet<Player> hs=new HashSet<Player>();
	String str="YES";
	while(str.toUpperCase().equals("YES")){
		System.out.println("Enter Player Name:");
		String name=sc.nextLine();
		System.out.println("Enter Skill:");
		String skill=sc.nextLine();
		Player p=new Player(name);
		
		if(hs.contains(p))
			System.out.println("Player "+name+" already exist");
		else
			hs.add(p);
		System.out.println("Do you want to continue(yes/no):");
		str=sc.nextLine();
	}
	IndexBuilder b=new IndexBuilder();
	TreeSet<Index> index = b.buildIndex(hs);

	b.displayIndex(index);

		

		sc.close();
	}

	}
