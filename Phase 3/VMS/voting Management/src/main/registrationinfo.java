package main;

import java.sql.*;

public class registrationinfo {

//	public String getRegistrationinfo(String Name)
//	{
	/*
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/voting management system","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select voter.Cnic,voter.Qualification,voter.State_Number,voter.Organization,voter.Post from voter where voter.Name='"+Name+"';");
			
			rs.next();
			
			String reginfo="Cnic: " + rs.getInt(1) + " \tQualification: "
		               + rs.getString(2)+ "\tState_Number: "+rs.getString(3)+"\tOrganization: "+rs.getString(4)+"\tPost: "+rs.getString(5);
			
			con.close();
			return reginfo;
			} catch(Exception e)
			{
			System.out.println(e);
			}
		*/
		
		
		public  void insert_info(String Cnic,String Password ,String Name,String Dob) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/voting management system","root","");
			    Statement stmt=con.createStatement();

			@SuppressWarnings("unused")
			int i=stmt.executeUpdate("insert into registration(Cnic,Password,Name,Dob) values('"+Cnic+"','"+Password+"','"+Name+"','"+Dob+"')");
			
			} catch(Exception e)
			{
			System.out.println(e);
			e.printStackTrace();
			}	
			
		}
	}
			

	
	

