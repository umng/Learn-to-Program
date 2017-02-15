import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Player p = new Player();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the player name");
		p.setName(sc.nextLine());
		System.out.println("Enter the country name");
		p.setCountry(sc.nextLine());
		System.out.println("Enter the skill");
		p.setSkill(sc.nextLine());
		
		System.out.printf("Player Details\nPlayer Name :%s\nCountry Name :%s\nSkill :%s\nVerify and Update Player Details\n",
				p.getName(), p.getCountry(), p.getSkill());
		
		while(i != 4) {
			System.out.println("Menu\n1.Update Player Name\n2.Update Country Name\n3.Update Skill\n4.All informations Correct/Exit\nType 1 or 2 or 3 or 4");
			i = Integer.parseInt(sc.nextLine());
			if(i == 1) {
				System.out.printf("The current player name is %s\nEnter the player name\n", p.getName());
				p.setName(sc.nextLine());
			} else if(i == 2) {
				System.out.printf("The current country is %s\nEnter the country\n", p.getCountry());
				p.setCountry(sc.nextLine());
			} else if(i == 3) {
				System.out.printf("The current skill is %s\nEnter the skill\n", p.getCountry());
				p.setCountry(sc.nextLine());
			} else if(i == 4) {
				System.out.printf("Player Details\nPlayer Name :%s\nCountry Name :%s\nSkill :%s", p.getName(), p.getCountry(), p.getSkill());
				break;
			}
		}
		sc.close();
	}

}
