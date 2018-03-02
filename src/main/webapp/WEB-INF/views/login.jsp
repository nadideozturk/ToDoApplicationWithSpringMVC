<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
			    		rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<%@ include file="nav.jspf"%>
<div class="container">
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="/login" method="POST">
		<fieldset class="form-group">
			<label>Name</label> <input name="userName" type="text"
				class="form-control" />
		</fieldset>
		<fieldset class="form-group">
			<label>Password</label> <input name="password" type="password"
				class="form-control" />
		</fieldset>
		<button type="submit" class="btn btn-success">Submit</button>
	</form>

</div>


	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>