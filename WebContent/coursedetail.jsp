<%@page import="model.Course"%>
<%@page import="model.CourseDao"%>
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
   int cid=Integer.parseInt(request.getParameter("cid"));
   Course c=new CourseDao().getCourse(cid);
%>
<img alt="" src="files/<%=c.getImgurl()%>">
<%=c.getCoursetitle() %>
<%=c.getCategory() %>
<%=c.getInstructor() %>
<%=c.getTotalenroll() %>
<%=c.getFees() %>
</body>
</html>