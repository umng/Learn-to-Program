import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;  


/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
			//fill the code
		HttpSession session = request.getSession();
		session.setAttribute("username",(String)session.getAttribute("username"));
		session.setAttribute("password",(String)session.getAttribute("password"));
		PrintWriter out=response.getWriter();
		out.println("<html><body>"
				+ "<a href='./ProfileServlet?name="+request.getParameter("name")+"' id=profile>My Profile</a> "
				+ "<a href='./SalaryServlet?name="+request.getParameter("name")+"' id=salary>Salary Details</a> "
				+ "<a href='./LogoutServlet' id=logout>Logout</a><br>"
				+ "<hr>"
				+ "<h2>Welcome "+request.getParameter("name")+"!!!</h2>"
				+ "</body></html>");			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}


