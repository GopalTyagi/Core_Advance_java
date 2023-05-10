
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
</style>

<body>
	<img align="right" src="img/rays.png" width="300" height="100">
	<br>
	<br>
	<%
		String name = (String) session.getAttribute("name");
	%>
	<%
		if (name != null) {
	%>
	<h1>
		Hii..
		<%=name%></h1>
	<%
		} else {
	%>
	<h2>Hii.. Guest</h2>
	<%
		}
	%>

	<br>
	<HR>



</body>
</html>