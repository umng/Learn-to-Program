import java.lang.reflect.Method;

import java.util.Scanner;

public class Main {
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int ch;
		User u=new User();
		
		System.out.println("1)Admin");
		System.out.println("2)Teacher");
		System.out.println("3)Student");
		System.out.println("Select Option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
					
					for(Method meth:u.getClass().getDeclaredMethods())
					{
						if(meth.getAnnotation(Roles.class)!=null&&meth.getAnnotation(Roles.class).toString().contains("Admin"))
						System.out.println(meth.getName());
					}
					
			break;
		case 2:
		
			for(Method meth:u.getClass().getDeclaredMethods())
			{
				if(meth.getAnnotation(Roles.class)!=null&&meth.getAnnotation(Roles.class).toString().contains("Teacher"))
				System.out.println(meth.getName());
			}
			break;
		case 3:
			
			for(Method meth:u.getClass().getDeclaredMethods())
			{
				if(meth.getAnnotation(Roles.class)!=null&&meth.getAnnotation(Roles.class).toString().contains("Student"))
					System.out.println(meth.getName());
			}
			break;
		}
		in.close();
	}

}