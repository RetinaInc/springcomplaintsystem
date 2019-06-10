<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Hello World !!!</p>
<form action="/submitComplaint" method ="post">
	Complaint: <textarea rows= "5" name="complaint"></textarea></br>
	
	Email: <input typ="text" name = "email"/></br>
	Name: <input type ="text" name ="name"/></br>
	<input type ="submit" value ="Submit"/>
</form>
</body>
</html>