<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
 <link rel="stylesheet" href="styles.css"/>
</head>
<body>
	<form method="post" action="ServletAvvio">
		<label>User</label> 
		<input type="text" name="user" placeholder="inserire username">
		<label>Email</label> 
		<input type="text" name="email" placeholder="inserire email">
		<button type="submit">Regista</button>
		
	</form>
</body>
</html>