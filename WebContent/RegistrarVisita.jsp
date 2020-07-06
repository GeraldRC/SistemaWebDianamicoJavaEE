<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>AGENDAR VISITA</h1>

	estamos agendando una visita al cliente ${solicitud.getNombreCliente()}, <br> 
	para realizar una ${solicitud.getTipoSolicitudString()}.
	
	cuando desea agendar esta visita?
	
	 <form action="RegistrarVisita" method="post">
	 
	
	 <input type="text" readonly="readonly" name="idSolicitud" value="${idSolicitud}"/><br>
	 <input type="text" readonly="readonly" name="rutProfesional" value="${rutProfesional}"/><br>
	 

	
	<input type="date" name="fecha"><br>

	 <button type="submit" >AGENDAR</button>
	
	</form>


</body>
</html>