<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
		<title> My first JSP </title> 
	</head> 
	<body> 
		<form action="HelloServlet"> Please enter a color <br> 
		<input type="text" name="color" size="20px"> <br>
		Enter your name <br>
		<input type="text" name="name" size="30px"><br>
		Enter your email <br>
		<input type="text" name="email" size="30px"><br>
		<input type="submit" value="submit"> 
		</form> 
	</body> 
</html>