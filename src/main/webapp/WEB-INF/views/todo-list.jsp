<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Welcome</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
			    		rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<table class="table table-striped">
				<caption>Hi ${userName} your todo list</caption>
				<thead>
					<tr>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Completed</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todolist}" var = "todo">
					<tr>
						<td>${todo.desc}</td>						
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}" /></td>
						<td>${todo.isDone}</td>
						<td><a class="btn btn-warning" href="/update-todo?id=${todo.id}">Update</a></td>
						<td><a class="btn btn-danger" href="/delete-todo?id=${todo.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<div>
				<a class="btn btn-success" href="/add-todo">Add</a>
			</div>
		</div>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</body>
</html>