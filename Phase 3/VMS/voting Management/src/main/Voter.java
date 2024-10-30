package main;
import java.sql.*;

public class Voter {

	public  void voter(String Name,String Cnic,String Qualification ,String state_Number,String Organization,String Post) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting management system","root","");
		    Statement stmt = con.createStatement();

	    	 stmt.executeUpdate("insert into voter(Name,Cnic,Qualification,state_Number,Organization,Post)  values('"+Name+"','"+Cnic+"','"+Qualification+"','"+state_Number+"','"+Organization+"','"+Post+"')");
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}	
		
	}

}
