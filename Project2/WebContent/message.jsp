<%@page import="java.sql.ResultSet"%>
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
<h1>Hello <%=session.getAttribute("name") %></h1>

<%

	DaoOperations daoOperations=new DaoOperations();
	ResultSet resultSet=daoOperations.display((String)session.getAttribute("name"));
	while(resultSet.next()){
		%>
		
		<p><%=resultSet.getString(1) %></p>
		<p><%=resultSet.getString(2) %></p>
		<p><%=resultSet.getInt(3) %></p>
		<p><%=resultSet.getString(4) %></p>
		
		<%
	}
%>
</body>
</html>