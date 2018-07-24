<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<marquee>
		<h4 style="color: maroon;">Deposit Successful</h4>
	</marquee>

	<div align="center">

		<h6 style="color: gray;">Customer Name :</h6>${customer.name}
		<h6 style="color: gray;">Customer Mobile No :</h6>${customer.mobileNo}
		<h6 style="color: gray;">Customer Balance :</h6>${customer.wallet.balance}

	</div>

	<div align="left">
		<a href="login">Log Out</a>
	</div>
</body>
</html>