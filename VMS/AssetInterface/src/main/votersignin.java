package main;
import java.sql.*;

public class votersignin {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/voting management system","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select voter.Name,voter.Cnic,voter.post from voter\r\n" + 
					"join signin\r\n" + 
					"on voter.cnic=signin.Cnic");

			while(rs.next())
			{
			System.out.println("Name: " + rs.getString(1) + "\tCnic: " + rs.getInt(2) + "\tPost: "+rs.getString(3));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	
	}

	}


