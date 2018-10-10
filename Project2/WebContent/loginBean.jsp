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

	<jsp:useBean id="student1" class="p1.Student" scope="session"/>
	<jsp:setProperty property="name" name="student1"/>
	<jsp:setProperty property="password" name="student1"/>
	
	<%
		DaoOperations daoOperations=new DaoOperations();
		if(daoOperations.login(student1.getName(), student1.getPassword())){
			session.setAttribute("name", student1.getName());
			%>
			<div>Logged Successfully</div>
			<jsp:forward page="message.jsp"/>
			<%
		}
		else{
			%>
			<div>Invalid Username or Password</div>
			<%
		}
	%>

</body>
</html>