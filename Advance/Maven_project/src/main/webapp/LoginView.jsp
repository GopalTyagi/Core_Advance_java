
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="WelcomeCtl">Welcome</a>
<%@ include file="Header.jsp" %>
	<center>

		<%
			String fname = (String) request.getAttribute("err");
		String uri = (String) request.getAttribute("uri");
		%>
		<%
			if (fname != null) {
		%>
		<%=fname%>
		<%
			}
		%>



		<form action="Login" method="post">

			<h1>
				<center>Login</center>
			</h1>
			<br> <label>LoginId</label><input type="text" name="loginId"><br>
			<br> <label>Password</label><input type="text" name="password"><br>
			<br> <input type="submit" name="operation" value="SignIn">
			<input type="submit" name="operation" value="SignUp">
			
		

	</center>
	<input type="hidden" name="uri" value="<%=uri%>">
	
		
	</form>
	<%@ include file="Footer.jsp" %>
</body>
</html>