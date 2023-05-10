<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" bgcolor="yellow">




		<%
			String fname = (String) request.getAttribute("err");
		%>
		<%
			if (fname != null) {
		%>
		<%=fname%>
		<%
			}
		%>

<center>

	<form action="User" method="post">


<h1><center>FILL FORM</center></h1>

<br>

<label>Name</label><input type="text"  name= "Name"><br><br>

<label>LoginId</label><input type="email" name="loginId"><br><br>
<label>Password</label><input type = "password"  name="password"><br><br>
<input type = "submit" name="operation" value="Add" >
</center>
</form>


 
</body>
</html>