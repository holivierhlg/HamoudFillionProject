<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Leave Request Form</title>
	</head>

	<body>
		<%
			String resp = request.getAttribute("accepted").toString();
			if (resp.equalsIgnoreCase("true"))
				out.println("Congrats! Your leave request for the day " + request.getParameter("day") + " has been accepted! :)");
			else
				out.println("Oh! Someone has already take a leave for the day " + request.getParameter("day") + ". Sorry :(");
		%>
	</body>
</html>