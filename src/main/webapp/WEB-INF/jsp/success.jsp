<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="hlieb.model.Person"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Login Successful!</h1>



	<jsp:useBean id="person" class="hlieb.model.Person" scope="request">
		<jsp:setProperty property="firstName" name="user"
			value="Watermelon Cat" />
	</jsp:useBean>



	Hello,
	<jsp:getProperty property="userName" name="user" />!
</body>
</html>