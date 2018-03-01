<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<table>
	<caption>Hi ${userName} your todo list</caption>
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is Completed</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todolist}" var = "todo">
		<tr>
			<td>${todo.desc}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.isDone}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a class="button" href="/add-todo">Add</a>
</body>
</html>