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
		Player p;
		try {
			p = new PlayerBO().validateLogin(username, password);
		
		out.println("<html><body>");
		out.println("<html><body>"
				+ "<a href='./HomeServlet?name="+request.getParameter("name")+"' id=home>Home</a> "
				+ "<a href='./ProfileServlet?name="+request.getParameter("name")+"' id=profile>My Profile</a> "
				+ "<a href='./LogoutServlet' id=logout>Logout</a><br>"
				+ "<hr>");
		out.println("<table id=profile>"
				+ "<tr><td>Name</td><td>"+p.getName()
				+ "<tr><td>UserName</td><td>"+p.getUsername()
				+ "<tr><td>Country</td><td>"+p.getCountry()
				+ "<tr><td>Skill</td><td>"+p.getSkill()
				+ "<tr><td>Team</td><td>"+p.getTeam()
				+ "</table></body></html>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


