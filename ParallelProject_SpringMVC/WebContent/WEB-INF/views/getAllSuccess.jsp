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
		<h4 style="color: maroon;">All Accounts</h4>
	</marquee>
	<hr>
	<br>

	<table align="center" border="1px solid black">
			<tr>
				<th>Customer Name</th>
				<th>Mobile Number</th>
				<th>Balance</th>
			</tr>
			<c:forEach items="${customer}" var="customers">
				<tr>
					<td>${customers.name}</td>
					<td>${customers.mobileNo}</td>
					<td>${customers.wallet.balance}</td>
				</tr>
			</c:forEach>
		</table>


	<div align="left">
		<a href="login">Logout</a>
	</div>

</body>
</html>