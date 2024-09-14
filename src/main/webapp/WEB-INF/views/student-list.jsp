<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentManagement</title>
<style>

table {
	border="2"
} 


</style>
</head>
<body>

<div align="center">

<form action="addStudent">
<input type="submit" value="ADD">

</form>

	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>mobile</td>
				<td>country</td>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>

</body>
</html>