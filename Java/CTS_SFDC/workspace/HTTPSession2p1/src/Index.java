import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


	//fill the code
		PrintWriter out=response.getWriter();
		out.println("<html><body><h2>Login</h2>");
		out.println("<form action='LoginServlet' method='get'>");
		
		if(request.getParameter("err")!=null)
		{
			out.println("<div id='errorMsg'>");
			out.println(request.getParameter("err"));
			out.println("</div>");
		}
		if(request.getParameter("logout")!=null)
		{
			out.println("<div id=logoutMsg>");
			out.println(request.getParameter("logout"));
			out.println("</div>");
		}

		out.println("UserName <input type='text' id=username name=username width=200px><br>"
				+ "Password <input type='password' id=password name=password width=200px><br>"
				+ "<input type='submit' id=Login name=login value='Login' width=200px>"
				+ "</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	    
	    
		
	}

}

