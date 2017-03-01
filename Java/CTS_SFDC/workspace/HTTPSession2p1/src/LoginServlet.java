import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		//fill the code
		try {

			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			Player p=new PlayerBO().validateLogin(username, password);
			if(p!=null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				session.setAttribute("password",password);
				request.getRequestDispatcher("/HomeServlet?name="+p.getName()).forward(request, response);
			}
			else
				response.sendRedirect("Index?err=Invalid username or password");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
            //response.sendRedirect("Index");
		}
}


