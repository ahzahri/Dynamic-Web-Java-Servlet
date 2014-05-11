<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
</head>
<body>
<h2>UsersList</h2>
<table>
	<tr>
	    <th>Id</th>
	    <th>First Name</th>
		<th>Last Name</th>
	</tr>
  	<c:forEach var="user" items="${requestScope['users']}" >
  		<tr>
  			<td>${user.id}</td>
  			<td>${user.firstName}</td>
  			<td>${user.lastName}</td>
  		</tr>
  	</c:forEach>
</table>
</body>
</html>