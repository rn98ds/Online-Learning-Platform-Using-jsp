<%@page import="org.apache.catalina.User"%>
<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   String email= request.getParameter("uname");
   String pass= request.getParameter("upass");
   try{
    UserDao db= new UserDao();
    
   boolean a= db.checkUser(email, pass);
   if(a)
   {
	   out.print("Welcome User  " +email);   
   }
   else
   {
	   request.getRequestDispatcher("login.jsp").include(request, response);
	   	out.print("<script>alert('Something Went Wrong, Wrong username or password')</script>");
	  // out.print("Something Went Wrong, Wrong username or password");
   }
   }
   catch (Exception e)
   {
	   e.printStackTrace();
   }
 %>  

</body>
</html>
<!-- add pop-up notification -->