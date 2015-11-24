<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Leave Request Form</title>
	</head>

	<body>
		<form action="http://localhost:8080/HamoudFillionProject/VerificationServlet" method="POST">
			Hi Minion!
			<br>Please choose the day you want to take a leave. The day has to be between 1 and 365.
			<br><br><input type="number" step="1" value="0" min="0" max="364" name="day">
			<br><br><input type="submit" value="Submit your request">
		</form>
	</body>

</html>
