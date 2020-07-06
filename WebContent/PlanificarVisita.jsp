<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>planificar visita</title>
</head>
<body>

<h1> PLANIFICAR VISITA</h1>


<h3>  LISTA SOLICITUDES PENDIENTES</h3>
<table>

	<c:forEach items="${solicitudes}" var="sol">

		<tr>
                
        	<form action="PlanificarVisita" method="post">

                <td>${sol.getID() }</td>
                <td>${sol.getNombreCliente() }</td>
            	<td>${sol.getTipoSolicitudString() }</td>
                
                <td> <button type="submit" name="AGENDAR" value="${sol.getID()}" >AGENDAR</button>
                 
    		</form>
		</tr>

	</c:forEach>


</table>
</body>
</html>