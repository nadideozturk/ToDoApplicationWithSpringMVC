<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
			    		rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<%@ include file="nav.jspf"%>
<h1>Welcome ${userName} and your password is ${password}</h1><br/>
Now, you can <a href="/list-todos">manage your todo list.</a> 
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>