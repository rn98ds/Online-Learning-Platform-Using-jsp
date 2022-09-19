package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao 
{
	Connection con;
	private Connection getConnection() throws ClassNotFoundException,SQLException
	   {
		String db="jsp_mvc";
		String url="jdbc:mysql://localhost:3306/"+db;
		String uname="root";
		String upass="abc123";
		
		   Class.forName("com.mysql.jdbc.Driver");
		   //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","abc123"); or method
		   Connection con=DriverManager.getConnection(url,uname,upass);
		   return con;
		   }
	public  int insert(User u) throws ClassNotFoundException,SQLException
	   {
		
		   int status=0;
		  // Connection con=Connectivity.getConnection();
		   con=getConnection();
		   PreparedStatement ps=con.prepareStatement("INSERT INTO user(name,email,password)"
		   		+ "VALUES(?,?,?)");
		   ps.setString(1, u.getName());
		   ps.setString(2, u.getEmail());
		   ps.setString(3, u.getPassword());
		   status=ps.executeUpdate();
		   return status;
	   }
      public boolean checkUser(String email,String pass) throws ClassNotFoundException,SQLException
      {
    	  //int status=0;
		   con=getConnection();
		   PreparedStatement ps=con.prepareStatement("SELECT * FROM user WHERE email=? and password=?");
		   ps.setString(1, email);
		   ps.setString(2, pass);
		     ResultSet rs=ps.executeQuery();
    	  return rs.absolute(1);
      }
}
