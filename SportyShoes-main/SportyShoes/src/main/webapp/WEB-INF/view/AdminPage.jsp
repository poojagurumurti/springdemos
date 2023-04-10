<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Sporty Shoes</title>

<style>
a {

padding-left: 50px;

}

</style>

</head>

<body style="background-color:#DAF7A6 ">

<a href=Home.jsp
style="color: black; text-decoration: none; font-size: 35px; font-weight: bold;">Sporty Shoes</a>

<br>
<br>
<br> <br>

<ul>

<li>

<a href="product" target="iframe">Products</a> </li>
<li><a href="user" target="iframe">Users</a> </li>

<li><a href="purchaseReport" target="iframe">Purchase Report</a></li>

</ul>

<br>
<br>

 

<iframe src="product" name="iframe"
style="height: 400px; width: 900px;"></iframe>

</body>

</html>
