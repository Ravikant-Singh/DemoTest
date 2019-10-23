<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student List</h1>
<table border="2" width="70%" cellpadding="2">
<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>MobileNumber</th>
			<th>Password</th>
			
</tr>
<c:forEach var="std" items="${studentlist}">
<tr>
           <td>${std.id}</td>  
          <td>${std.firstname}</td>  
          <td>${std.mblnum}</td>  
          <td>${std.username}</td>
          <td>${std.password}</td>
          <a href="delete">Delete</a>
</tr>
</c:forEach>

</body>
</html>