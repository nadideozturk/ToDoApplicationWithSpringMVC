<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<p>${error}</p>
<form action="/spring-mvc/login" method = "post">
Username:<input type="text" name="userName"/> Password:<input type="password" name="password"/> <input type="submit" value="submit"/>
</form>
</body>
</html>