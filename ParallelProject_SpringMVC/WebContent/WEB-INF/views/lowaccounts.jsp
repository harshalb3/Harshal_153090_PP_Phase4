<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<marquee>
		<h4 style="color: maroon;">Low Accounts</h4>
	</marquee>
	<hr>
	<br>

	<form:form action="showLowAccounts" method="post"
		modelAttribute="customer">
		<table align="center">
			<tr>
				<td><input type="submit" value="SHOW LOW ACCOUNTS" /></td>
			</tr>
		</table>
	</form:form>

	<div align="left">
		<a href="login">Logout</a>
	</div>
</body>
</html>