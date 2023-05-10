<%@ page errorPage="ExceptionHandler.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int age = Integer.parseInt(request.getParameter("age"));
%>
<p>
Your Age is
<h1><%=age%> years</h1>
</p>
</body>
</html>