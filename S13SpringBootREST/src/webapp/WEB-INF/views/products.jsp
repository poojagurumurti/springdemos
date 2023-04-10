
<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Products</title>
</head>
<body>
<h1>Manage Products</h1>
<form action="products" method="post">
	<pre>
		
		Name: <input type="text" name="name"/>
		Description: <input type="text" name="desc"/>
		Price: <input type="text" name="price"/>
		<input type="submit" name="Add Product"/>
	</pre>
</form>
<p>${message}</p>


<ul>
	<c:forEach items="${products}" var="product">
		<li>${product.id} | ${product.name} | ${product.desc} | ${product.price}</li>
	</c:forEach>
</ul>
</body>

</html>
