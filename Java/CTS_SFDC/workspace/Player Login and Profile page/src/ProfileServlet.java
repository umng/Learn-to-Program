import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String outData = "";
		
		Player player = (Player) request.getSession().getAttribute("player");
		
		outData += "<html>"
				+ "<head><title>Profile</title></head>"
				+ "<body>"
				+ "<a href='HomeServlet'>Home</a>"
				+ "&nbsp;<a href='ProfileServlet'>My Profile</a>"
				+ "&nbsp;<a href='LogoutServlet'>Logout</a>"
				+ "<hr>"
				+ "<table id='profile'>"
				+ "<tr><td>Name</td><td>" + player.getName() + "</td></tr>"
				+ "<tr><td>UserName</td><td>" + player.getUsername() + "</td></tr>"
				+ "<tr><td>Country</td><td>" + player.getCountry() + "</td></tr>"
				+ "<tr><td>Skill</td><td>" + player.getSkill() + "</td></tr>"
				+ "<tr><td>Team</td><td>" + player.getTeam() + "</td></tr>"
				+ "</table>"
				+ "</body>"
				+ "</html>";
		
		response.getWriter().print(outData);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

