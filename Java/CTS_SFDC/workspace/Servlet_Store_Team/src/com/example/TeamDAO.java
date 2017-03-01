package com.example;

import java.util.ResourceBundle;
import java.sql.*;

public class TeamDAO {

	ResourceBundle rb= ResourceBundle.getBundle("mysql");
    String url=rb.getString("db.url");
    String user=rb.getString("db.username");
    String pass=rb.getString("db.password");
	
	public void createCity(City city) throws ClassNotFoundException,SQLException
	{
	    try {
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "pass");
			String query="insert into city(id,name) values(?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, city.getId());
			ps.setString(2, city.getName());
			
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	public Boolean createTeam(Team team)throws ClassNotFoundException,SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "pass");
			String query="insert into team(name,coach,home_city_id,captain) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, team.getName());
			ps.setString(2, team.getCoach());
			ps.setInt(3,team.getHomeCity().getId());
			ps.setInt(4, team.getCaptain());
			
			int count=ps.executeUpdate();
			if(count!=0)
				return true;
			else
				return false;
	}
	
	public int getPlayerIdByPlayerName(String name)throws ClassNotFoundException,SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "pass");
		String query="select id from player where name=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, name);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
			return rs.getInt(1);
		else
			return 0;
	}
	
	public int getCityIdByCityName(String name)throws ClassNotFoundException,SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "pass");
		String query="select id from city where name=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
			return rs.getInt(1);
		else
			return 0;
	}
}
