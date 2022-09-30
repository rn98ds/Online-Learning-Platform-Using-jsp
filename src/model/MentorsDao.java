package model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MentorsDao 
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
		   Connection con=(Connection) DriverManager.getConnection(url,uname,upass);
		   return con;
		   }
	public int MentorsCount() throws ClassNotFoundException, SQLException
	{
		String sql = "select count(*) from mentor";
		con=getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count =rs.getInt(1);
		con.close();
	
		return count;
	}
}
