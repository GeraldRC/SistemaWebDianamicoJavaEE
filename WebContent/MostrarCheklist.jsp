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

<h1> REPORTE CHEKLIST</h1>
<table>
		<c:forEach items="${cheklist}" var="list">
                        	<tr>
                            	<td>${list.getId()} </td>
                            	<td>${list.getChek()}</td>
                        	</tr>
                        </c:forEach>
</table>
</body>
</html>