<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ingresar Actividad Mejora</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="IngresarActivMejora" method="post">
	<label>Asesoria Id:</label> <input type="number" name="asesoriaid" /><br/>
	<label>Id:</label> <input type="number" name="id1" /> <br/>
	<label>>Estado Mejora Id:</label> <input type="number" name="estadomejoraid" /> <br/>
	<label>Descripción:</label> <input type="number" name="descripcion" /> <br/>
	<input type="submit" value="Ingresar Actividad Mejora" />
</form>
<br><br>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>