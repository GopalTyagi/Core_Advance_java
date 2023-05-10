 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="in.co.rays.bean.UserBean"%>
<%@page import="in.co.rays.ctl.UserListCtl"%>
<%@ page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<form action="Userlist.do" method="post">



	<h1 align="center">User List</h1>

<td>FirstName
			<input type="text" name="fname" >
			<input type="submit" name="operation" value="search">
			</td>

	<center>
		<%
			List list = (List) request.getAttribute("list");
		
		%>
		<%
			Iterator<UserBean> it = list.iterator();
			if (list != null) {
		%>
		<br>


		<table border="1" width="100%" align="center" cellpadding=6px
			cellspacing=".2">
			
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Login id</th>
				<th>Password</th>

				<th>EDIT</th>

			</tr>



			<%
				while (it.hasNext()) {
						UserBean bean = (UserBean) it.next();
			%>
			<tr align="center">
				<td><%=bean.getId()%></td>
				<td><%=bean.getName()%></td>
				<td><%=bean.getLoginId()%></td>

				<td><%=bean.getPassword()%></td>

				<td><a href="User?id=<%=bean.getId()%>">edit</a></td>
				<%
					}
				%>
				<%
					}
				%>
			</tr>
		</table>

	</center>
	</form>
	
	<%@ include file="Footer.jsp" %>
</html>