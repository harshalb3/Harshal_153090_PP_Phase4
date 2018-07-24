<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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

	<table align="center" border="1px solid black">
		<tr>
			<th>Mobile Number</th>
			<th>Name</th>
			<th>Balance</th>
		</tr>
		<c:forEach items="${customer}" var="element">
			<tr>
				<td>${element.mobileNo}</td>
				<td>${element.name}</td>
				<td>${element.wallet.balance}</td>
			</tr>
		</c:forEach>
	</table>


	<div align="left">
		<a href="login">Logout</a>
	</div>
</body>
</html>