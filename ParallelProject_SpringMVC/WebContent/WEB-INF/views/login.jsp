<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.error{
color:red;
}

</style>
</head>
<body>

	<div align="center">
		<h2>Welcome To Login</h2>
	</div>
	<hr>
	<br>
	<form:form action="getCustomer" method="post" modelAttribute="customer">
		<table align="center">
			<tr>
				<td>Enter Your Registerd Mobile Number :</td>
				<td><form:input path="mobileNo" size="20" /></td>
				<td><form:errors path="mobileNo" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="LOGIN"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>