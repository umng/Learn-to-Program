
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Index() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String output="<html><head><title>Team Details</title>";
		
		output+="<style>b{float:left;width:6em;} input{text-align:left;}</style>"+
		"<body><form action='Display' method='post'><br>"+
				"<b>Name</b><input type='text' name='name' placeholder='Chennai Super Kings'><br>"+
		"<b>Coach</b><input type='text' name='coach' placeholder='Stephen Fleming'><br>"+
				"<b>City</b><input type='text' name='city' placeholder='Chennai'><br>"+
		"<b>Captain</b><input type='text' name='captain' placeholder='MS Dhoni'><br>"+
				"<input type='submit' name='submit' value='Submit'><br>"+
		"</form></body><html>";
		out.print(output);
		out.close();
	}

}
