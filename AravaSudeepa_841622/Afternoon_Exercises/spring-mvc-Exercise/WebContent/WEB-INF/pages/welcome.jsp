<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>This is welcome page</h2>
<br>
<h3>Title: ${model.title}</h3>
<br>
<h3>Employee info: </h3>
 ${model.employeesObj}
 <hr />
 <h3>Title: All employees list: </h3>
 <table border = "2">
		<tr>
			<th>Id</th><th>Name</th><th>Salary</th>
		</tr>
		<c:forEach items="${model.employeeList}" var = "e">
			<tr>
				<td>${e.id}</td><td>${e.name}</td><td>${e.salary}</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>