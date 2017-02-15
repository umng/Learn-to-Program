
public class UserMainClass {
	public static void display(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		addToBuffer(sb, s1);
		addToBuffer(sb, "#");
		addToBuffer(sb, s2);
		System.out.print(sb.toString());
	}
	
	private static StringBuilder addToBuffer(StringBuilder sb, String s) {
		return sb.append(s);
	}
}
