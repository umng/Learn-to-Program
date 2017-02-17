import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("rawtypes")
		Class cal = Calculator.class;

		Method[] methods = cal.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println((i++) + ") " + m.getName());
		}

		i = sc.nextInt();
		sc.close();
		
		if(i <=4)
			System.out.print("@" + methods[i-1].getAnnotation(Arithmetic.class).str() + "()");
		else if(i >=5 && i <= 8)
			System.out.print("@" + methods[i-1].getAnnotation(Scientific.class).str() + "()");
		else
			System.out.print("No annotation found");
		
	}

}
