
public class User {
	@Roles({@Role("Admin"), @Role("Teacher"), @Role("Student")})
	public void login()
	{
		
	}
	@Roles({@Role("Admin")})
	public void resetPassword()
	{
		
	}
	@Roles({@Role("Student")})
	public void takeTest()
	{
		
	}
	@Roles({@Role("Teacher")})
	public void postResults()
	{
		
	}
	@Roles({@Role("Teacher")})
	public void attendanceReport()
	{
		
	}
	
	@Roles({@Role("Admin")})
	public void createUser()
	{
		
	}

	@Roles({@Role("Admin"), @Role("Teacher"), @Role("Student")})
	public void logout()
	{
		
	}
	
	

}