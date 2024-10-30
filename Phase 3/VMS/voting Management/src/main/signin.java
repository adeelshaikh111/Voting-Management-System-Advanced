package main;
import java.sql.*;

public class signin {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/voting management system","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from signin");

			while(rs.next())
			{
			System.out.println("Cnic: " + rs.getInt(1) + "\tPassword: " + rs.getString(2));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}

	}


