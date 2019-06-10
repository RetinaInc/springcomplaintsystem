<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File a Complaint</title>
</head>
<body>
<p>File your complaint</p>
<form action="/complaintsystem/submitComplaint" method ="post" id ="complaintForm" >
	Complaint: <textarea rows= "5" name="complaint"></textarea></br>
	
	Email: <input type="text" name ="email"/></br>
	Name: <input type ="text" name ="name"/></br>
	<input type ="submit" value ="Submit"/>
</form>
</body>
</html>