<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="${mensaje}" />
	
	<br><br><br><br><br>
	
	<c:forEach items="${lista}" var="list">
	<tr>
		<td>${list.getId()} </td>
		<td>${list.getCapacitacion()}</td><br><br>
		
		
	</tr>
</c:forEach>

</body>
</html>