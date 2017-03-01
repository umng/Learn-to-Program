import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;    


/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			//fill the code
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("username");
		String password=(String)session.getAttribute("password");
		System.out.println(username+"   "+password);
		PrintWriter out=response.getWriter();
		Employee e = new EmployeeBO().validateLogin(username, password);
		
		out.println("<html><body>"
				+ "<a href='./ProfileServlet?name="+request.getParameter("name")+"' id=profile>My Profile</a> "
				+ "<a href='./SalaryServlet?name="+request.getParameter("name")+"' id=salary>Salary Details</a> "
				+ "<a href='./LogoutServlet' id=logout>Logout</a><br>"
				+ "<hr>");
		out.println("<table id=profile>"
				+ "<tr><td>Name</td><td>"+e.getName()
				+ "<tr><td>UserName</td><td>"+e.getUserName()
				+ "<tr><td>Email</td><td>"+e.getEmail()
				+ "</table></body></html>");
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


