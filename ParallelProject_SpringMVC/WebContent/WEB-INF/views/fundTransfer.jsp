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

<div align="center">
		<h2>Welcome To Fund Transfer Portal</h2>
	</div>
	<hr>
	<br>
	<form:form action="customerTransfer" method="post">
		<table align="center">
			<tr>
				<td>Enter Your Mobile Number :</td>
				<td><input type="text" name="sourceMobileNo"></td>
			</tr>
			
			<tr>
				<td>Enter Recieving Mobile Number :</td>
				<td><input type="text" name="targetMobileNo"></td>
			</tr>
			
			<tr>
				<td>Enter The Amount To Be Transfered :</td>
				<td><input type="text" name="amount"></td>
			</tr>
			
			<tr><td><input type="submit" value="TRANSFER"></td></tr>
		</table>

	</form:form>

</body>
</html>