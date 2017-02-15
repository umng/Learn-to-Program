
public class UserMainCode {
	public static void display(String firstName, String lastName) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.valueOf(firstName.charAt(0)).toUpperCase());
		sb.append(firstName.substring(1).toLowerCase());
		sb.append(" ");
		sb.append(lastName.toUpperCase());
		
		System.out.println(sb.toString());
	}
}
