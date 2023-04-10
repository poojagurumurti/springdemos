<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<h2>Manage Products</h2>
	
	<form action="products" method="post">
		<pre>
		       Name:<input type="text" name="name">
		Description:<input type="text" name="desc">
		      Price:<input type="text" name="price">
				<input type="submit" name="Add Product" value=AddProduct>
		</pre>
	</form>
	<p>${message }</p>
	<ul>
		<c:forEach items="${products }" var="product">
		<li>${product.id }  |  ${product.name }  |  ${product.desc }  |  ${product.price }</li>
		</c:forEach>
	</ul>
	
</body>
</html>