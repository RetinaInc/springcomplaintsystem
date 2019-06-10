<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Password</title>
</head>
<body>
<p>Enter Admin Password</p>
<form action="/complaintsystem/showComplaints" id="passwordForm" method="post">
	Password: <input type ="password" name="pass"/><br>
	<input type ="submit" value ="Submit"/>
</form>
</body>
</html>