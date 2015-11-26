<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login</title>
	</head>

	<body>
		<form action="http://localhost:8080/HamoudFillionProject/AuthentificationServlet" method="POST">
			Hi Minion!
			<br>Please login.
			<br><br><input type="text" name="login">
			<br><br><input type="password" name="password">
			<br><br><input type="submit" value="Login">
		</form>
	</body>

</html>
