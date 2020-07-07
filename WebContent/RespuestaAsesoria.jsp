<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${mensaje}</h1>
	
	<a href="${pageContext.request.contextPath}/SolicitudesPendientes">PLANIFICAR VISITA</a>
	<a href="${pageContext.request.contextPath}/LeerSolicitudesAgendadas"> INGRESAR OTRA ASESORIA</a>

</body>
</html>