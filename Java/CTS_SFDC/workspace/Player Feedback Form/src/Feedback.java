

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feedback
 */
@WebServlet("/Feedback")
public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feedback() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String bowling = request.getParameter("bowling");
		String batting = request.getParameter("batting");
		String fielding = request.getParameter("fielding");
		String attitude = request.getParameter("attitude");
		String rating = request.getParameter("rating");
		String comments = request.getParameter("comments");
		
		String outData = "<html><head><title>Player Feedback Form</title></head><body><h2>Feedback of player ";
		outData += name + "</h2><table id='feedback'><tbody>";
		outData += "<tr><td>Bowling</td><td>" + bowling + "</td></tr>";
		outData += "<tr><td>Batting</td><td>" + batting + "</td></tr>";
		outData += "<tr><td>Fielding</td><td>" + fielding + "</td></tr>";
		outData += "<tr><td>Rating</td><td>" + rating + "</td></tr>";
		outData += "<tr><td>Attitude</td><td>" + attitude + "</td></tr>";
		outData += "<tr><td>Comments</td><td>" + comments + "</td></tr>";
		
		outData += "</tbody></table></body></html>";
		
		PrintWriter out = response.getWriter();
		out.print(outData);
	}

}
