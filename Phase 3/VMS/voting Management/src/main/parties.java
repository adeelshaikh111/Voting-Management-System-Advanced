package main;

import java.sql.*;

public class parties {
	public String getPartyinfo(String Party_name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/voting management system","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from parties where parties.Party_name='"+Party_name+"';");

			rs.next();
			String getinfo="Party_designation: " + rs.getString(2) + "\tCnic: " + rs.getString(3);
			
			con.close();
			return getinfo;
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return " ";
	}
		
	}
		

