<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
a {align ="right";
	
}
</style>
</head>
<body>
	<marquee>
		<h6>You Have been Successfully Registered</h6>
	</marquee>
	<hr>
	<br>
	<div align=center>
		<h5>Customer Details</h5>

		<h6 style="color: gray;">Customer Name :</h6>${customer.name}
		<h6 style="color: gray;">Customer Mobile No :</h6>${customer.mobileNo}
		<h6 style="color: gray;">Customer Balance :</h6>${customer.wallet.balance}

		<br> <br>
	</div>
	<a href="">Go Back</a>
</body>
</html>