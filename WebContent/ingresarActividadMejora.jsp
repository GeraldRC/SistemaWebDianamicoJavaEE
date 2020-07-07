<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
  <!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />
  <style>
    .cs:hover {
      background-color: #c62828;
      color: whitesmoke;
    }
  </style>
  <title>Visita</title>
</head>

<body>
<% HttpSession sesion = request.getSession(); 
	String rol ="";
    if(sesion.getAttribute("rol") != null && sesion.getAttribute("rol").toString().equalsIgnoreCase("profesional")){
    	rol = sesion.getAttribute("rol").toString();
    }else{
    	response.sendRedirect("login.jsp");
    }%>
  <nav class="nav-wrapper blue lighten-1">
    <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
    <a href="#" class="brand-logo">Sistema</a>
    <ul id="nav-mobile" class="right hide-on-med-and-down">
    	<li><%out.print(rol.toUpperCase());%></li>
      	<li><a href="PanelProfesional.jsp">PanelPro</a></li>
      	<li><a class="cs" href="logout">Cerrar Sesion</a></li>
    </ul>
  </nav>
  <ul id="slide-out" class="sidenav">
    <li>
      <div class="user-view">
        <div class="background">
          <img src="https://picsum.photos/300/300?random=1" />
        </div>
        <a href="#user"><img class="circle" src="https://picsum.photos/200/300?random=2" /></a>
        <a href="perfil.jsp"><span class="white-text name">John Doe</span></a>
        <a href="#email"><span class="white-text email">jdandturk@gmail.com</span></a>
      </div>
    </li>
    	<li><%out.print(rol.toUpperCase());%></li>
      	<li><a href="PanelProfesional.jsp">PanelPro</a></li>
      	<li><a class="cs" href="logout">Cerrar Sesion</a></li>
    <li>
      <div class="divider"></div>
    </li>
    <li><a class="cs" href="logout">Cerrar Sesion</a></li>
  </ul>
  <div class="row container">
    <h1>Ingresar Actividad Mejora</h1>
		<c:if test="${cumensaje != null}">
			<c:out value="${cumensaje}" />
		</c:if>

		<form action="IngresarActivMejora" method="post">
			<div class="container">
			`	<div class="row ">
					<div class="col s12 m5 l6 input-field">
						<input type="number" name="asesoriaid" />
						<label for="asesoriaid">Asesoria Id</label>
					</div>
				</div>
				<div class="row ">
					<div class="col s12 m5 l6 input-field">
						<input type="number" name="id1" />
						<label for="id1">Id</label>
					</div>
				</div>
				<div class="row ">
					<div class="col s12 m5 l6 input-field">
						<input type="number" name="estadomejoraid" />
						<label for="estadomejoraid">Estado Mejora Id</label>
					</div>
				</div>
				<div class="row ">
					<div class="col s12 m5 l6 input-field">
						<input type="number" name="descripcion"/>
						<label for="descripcion">Descripción</label>
					</div>
				</div>
				<div class="row">
					<div class="col s12 m5 l6 input-field">
						<button class="btn waves-effect waves-light" type="submit" name="action">Ingresar Actividad
    						<i class="material-icons right">send</i>
  						</button>
					</div>
				</div>
			</div>
		</form>
  </div>

  <script src="js/check.js"></script>
  <!- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script>
      document.addEventListener("DOMContentLoaded", function () {
        M.AutoInit();
      });
    </script>
</body>

</html>