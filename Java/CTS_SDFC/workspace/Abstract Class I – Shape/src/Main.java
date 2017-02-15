import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int l, b, r; 
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Circle\nSquare\nRectangle\nEnter the shape name");
		s = sc.nextLine();
		
		Shape sp;
		if(s.equals("Rectangle")) {
			System.out.println("Enter the length");
			l = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the breadth");
			b = sc.nextInt();
			sc.close();
			
			sp = new Rectangle(s, l, b);
			System.out.printf("Area of Rectangle is %.2f", sp.calculateArea());
		} else if(s.equals("Square")) {
			System.out.println("Enter the side");
			l = sc.nextInt();
			sc.close();

			sp = new Square(s, l);
			System.out.printf("Area of Square is %.2f", sp.calculateArea());
		} else if(s.equals("Circle")) {
			System.out.println("Enter the radius");
			r = sc.nextInt();
			sc.close();
			
			sp = new Circle(s, r);
			System.out.printf("Area of Circle is %.2f", sp.calculateArea());
		}
	}
}
