<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
a:hover {
    color: hotpink;
}
</style>
</head>
<body>

	<marquee>
		<h4 style="color: maroon;">Welcome ${customer.name}</h4>
	</marquee>

	<div align="center">

		<h6 style="color: gray;">Customer Name :</h6>${customer.name}
		<h6 style="color: gray;">Customer Mobile No :</h6>${customer.mobileNo}
		<h6 style="color: gray;">Customer Balance :</h6>${customer.wallet.balance}

	</div>
	<hr>
	<hr>
	<br>
	<div align="center">
		<h6>Choose Your Opertaion</h6>
	</div>
	<div align="center">
		<a href="deposit">Deposit Amount</a><br> 
		<a href="withdraw">Withdraw Amount</a><br> 
		<a href="transfer">Transfer Amount</a><br> 
		<a href="show">Show Transactions</a><br>
		<a href="lowaccounts">Show Low Accounts</a><br>
		<a href="getall">Show All Accounts</a><br>
	</div>
</body>
</html>