
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Display() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String coach=request.getParameter("coach");
		String city=request.getParameter("city");
		String captain=request.getParameter("captain");
		
		Boolean check=null;
		TeamBO tbo=new TeamBO();
		//out.print(name+coach+city+captain);
		
		String output="<html><head><title>Inserted</title>"+
		"<style></style>";
		try {
			int cityId=tbo.getCityIdByCityName(city);
			tbo.createCity(new City(cityId,city));
			check=tbo.createTeam(new Team(name,coach,new City(cityId,city),tbo.getPlayerIdByPlayerName(captain)));
			if(check==true)
			{
				output+="Team Created Successfully<br>"+
			"Team Details are<br>"+
						"<table><tr>"+
			"<th>Name</th>"+
						"<th>Coach</th>"+
			"<th>City</th>"+
						"<th>Captain</th>"+
			"</tr><tr>"+
						"<td>"+name+"</td>"+
			"<td>"+coach+"</td>"+
						"<td>"+city+"</td>"+
			"<td>"+captain+"</td>"+
						"</tr></table></body></html>";
				
			}
		} catch (Exception e) {e.printStackTrace();}
		out.print(output);
	}

}
