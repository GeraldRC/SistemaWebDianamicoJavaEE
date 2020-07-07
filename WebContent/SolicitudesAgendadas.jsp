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
<h1> SOLICITUDES AGENDADAS</h1>
<table>

<tr>
<th>ID SOLICITUD DE VISITA</th>
<th>NOMBRE DE CLIENTE</th>
<th>FECHA AGENDADA </th>
<th> AGREGAR ASESORIA</th>
<!-- <th></th> -->
<!-- <th></th> -->


</tr>
		<c:forEach items="${listaSolicitudes}" var="lista">
<form action="DesplegarAsesoria" method="post">
                <tr>
					<td>${lista.getID()}</td>
                    <td>${lista.getNombreCliente()}</td>
                    <td>${lista.getFecha()}</td>
                    <td> <button type="submit" name="asesoria" value="${lista.getID()}">ASESORAR</button></td>
                    
                    
                    </tr>




</form>
        </c:forEach>
</table>
</body>
</html>