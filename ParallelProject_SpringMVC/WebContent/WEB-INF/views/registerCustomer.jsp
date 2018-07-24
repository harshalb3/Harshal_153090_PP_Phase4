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
		<h2>Welcome To The SignUp Page</h2>
	</div>
	<hr>
	<br>

	<form:form action="registerCustomer" method="post"
		modelAttribute="customer">

		<table align="center">


			<tr>
				<td>Enter Your Name :</td>
				<td><form:input path="name" size="20" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Enter Your Mobile Number :</td>
				<td><form:input path="mobileNo" size="20" /></td>
				<td><form:errors path="mobileNo" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Enter Your Initial Balance :</td>
				<td><form:input path="wallet.balance" size="20" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="SIGNUP"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>