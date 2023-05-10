<%@ page import="in.co.rays.bean.UserBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>


  <% UserBean bean = (UserBean) request.getAttribute("bean");

%>
	<form action="User" method="post">


<h1><center>Update</center></h1>



<input type="hidden"  name= "id" value="<%=bean.getId()%>"><br><br>
<label>Name</label><input type="text"  name= "Name" value="<%=bean.getName()%>"><br><br>
<label>LoginId</label><input type="email" name="loginId" value="<%=bean.getLoginId()%>"><br><br>
<label>Password</label><input type = "password"  name="password" value="<%=bean.getPassword()%>"><br><br>
<input type="submit" name="operation" value="Update">
</center>
</form>

</body>
</html>