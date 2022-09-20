<%@page import="java.sql.SQLException"%>
<%@page import="model.User"%>
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
   String name= request.getParameter("name");
   String email= request.getParameter("email");
   String pass= request.getParameter("pass");
   try{
	
	   UserDao db=new UserDao();
	   if(db.checkEmail(email))
	   {
		   request.getRequestDispatcher("index.jsp").include(request, response);
	   	out.print("<script>alert('Email Already Registor')</script>");
	   }
	   else{
	   User u=new User(name,email,pass);
	   int a= db.insert(u);
	   if(a>0)
	   {
	   	out.print("data inserted");
	   }
	   else
	   {
	   	out.print("data not inserted");
	   }
	   }
	   } 
	   catch (Exception e) {
	   	e.printStackTrace();
	   }
%>
 <!-- To do no same registration
       css padding thik karna hai -->
</body>
</html>