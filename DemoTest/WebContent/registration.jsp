<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<style>
body {
	background-color: coral;
}

.center {
	margin: auto;
	width: 60%;
	border: 3px solid #73AD21;
	padding: 10px;
}
#myField .error input {
  border-color: red;
}
</style>
<h1><center>Student Details</center></h1>
	
	<form action="registartion" method="post" modelAttribute="st1">
	<div id="myField">
		<table>
			<tr>
				<td>FirstName:<input type="text" name="firstname"><br>
				<br></td>
			</tr>
			<tr>
				<td>MobileNumber:<input type="number" name="mblnum"><br>
				<br></td>
			</tr>
			<tr>
				<td>Username:<input type="text" name="username"><br>
				<br></td>
			</tr>
			<tr>
				<td>Password:<input type="password" name="password"><br>
				<br></td>
			</tr>
			
			<tr>
				<td>Submit:<input type="submit"  value="submit"><br>
				<br></td>
			</tr>
			</div>
			</form>
			
		</table>
</body>
</html>