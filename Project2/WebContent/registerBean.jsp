<%@page import="utility.DaoOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="student" class="p1.Student" scope="session"/>
	<jsp:setProperty property="*" name="student"/>
	
	<%
	
		DaoOperations daoOperations=new DaoOperations();
		if(daoOperations.register(student)){
			%>
			<div>Registered</div>
			<a href="login.jsp">Login</a>
			<%
		}
		else{
			%>
			<div>Not Registered</div>
			<a href="register.jsp">Login</a>
			<%
		}
	
	%>

</body>
</html>