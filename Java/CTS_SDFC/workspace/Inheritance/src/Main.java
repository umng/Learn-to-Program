import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, l, b, r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");
		i = sc.nextInt();
		sc.nextLine();
		
		if(i == 1) {
			System.out.println("Enter length and breadth:");
			l = sc.nextInt();
			sc.nextLine();
			b = sc.nextInt();
			sc.close();
			
			Shape rect = new Rectangle(l, b);
			System.out.printf("Area of Rectangle is:%.2f", rect.calculateArea().floatValue());
		} else if(i == 2) {
			System.out.println("Enter side:");
			l = sc.nextInt();
			sc.close();
			
			Shape sq = new Square(l);
			System.out.printf("Area of Square is:%.2f", sq.calculateArea().floatValue());
		} else if(i == 3) {
			System.out.println("Enter Radius:");
			r = sc.nextInt();
			sc.close();
			
			Shape cr = new Circle(r);
			System.out.printf("Area of Circle is:%.2f", cr.calculateArea().floatValue());
		}
	}
}
