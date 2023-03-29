<%@ page language="java" contentType="text/html" isELIgnored="false" %>

<html>
<head>
<title>Hello World</title>
</head>
<body>
<h1>Hello!! Welcome to Spring MVC</h1>

	<%
	Integer id=(Integer) request.getAttribute("id");
	out.println("Id:" +request.getAttribute("id")+"<br/>");
	out.println("Name:" +request.getAttribute("name")+"<br/>");
	out.println("Salary:" +request.getAttribute("salary"));
	
	%>
	<p>Id:<b>${id}</b></p>
	<p>Name:<b>${name}</b></p>
	<p>Salary:<b>${salary}</b></p>
	
	<p>${employee}</p> 
</body>

</html>