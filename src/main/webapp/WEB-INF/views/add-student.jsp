<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD STUDENT</title>
</head>
<body>

<div align="center">
<h2>ADD STUDENT</h2>

	<form:form action = "saveStudent" modelAttribute="student" method = "POST">
		<label>Name :</label>
		<form:input path="name" />
		<br />
		<label>Mobile :</label>
		<form:input path="mobile" />
		<br />
		<label>Country :</label>
		<form:input path="country" />
		<br />
		<input type="submit" value="Submit">
		<br />
	</form:form>
</div>
</body>
</html>