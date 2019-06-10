<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Show Complaints</title>
</head>
<body>
<p>Show Complaints</p>
<table>
<tr>
	<td>ID</td>
	<td>Sender</td>
	<td>Complaint</td>
	<td>Sender's Email</td>
</tr>
<c:forEach items="${complaints }" var ="complaint">

<tr>
	<td><c:out value="${complaint.id}"/></td>
	<td><c:out value="${complaint.senderName}"/></td>
	<td><c:out value="${complaint.message}"/></td>
	<td><c:out value="${complaint.senderEmail}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>