
public class UserMainCode {
	public static void display(String s) {
		String name = s.substring(0, s.indexOf(","));
		s = s.substring(s.indexOf(",") + 1);
		String age = s.substring(0, s.indexOf(","));
		s = s.substring(s.indexOf(",") + 1);
		String team = s.substring(0, s.indexOf(","));
		s = s.substring(s.indexOf(",") + 1);
		String role = s;
		System.out.println(
				name
				+ "\n" + age
				+ "\n" + team
				+ "\n" + role
				);
	}
}
