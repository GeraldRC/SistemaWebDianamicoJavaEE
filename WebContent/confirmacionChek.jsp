
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--Import Google Icon Font-->
    <link
      href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet"
    />
    <!-- Compiled and minified CSS -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"
    />
    <style>
      .cs:hover {
        background-color: #c62828;
        color: whitesmoke;
      }
    </style>
    <title>Visita</title>
  </head>

  <body>
    <nav class="nav-wrapper blue lighten-1">
      <a href="#" data-target="slide-out" class="sidenav-trigger"
        ><i class="material-icons">menu</i></a
      >
      <a href="#" class="brand-logo">Sistema</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="panelPro.jsp">PanelPro</a></li>
        <li><a class="cs" href="login.html">Cerrar Sesion</a></li>
      </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
      <li>
        <div class="user-view">
          <div class="background">
            <img src="https://picsum.photos/300/300?random=1" />
          </div>
          <a href="#user"
            ><img class="circle" src="https://picsum.photos/200/300?random=2"
          /></a>
          <a href="perfil.jsp"><span class="white-text name">John Doe</span></a>
          <a href="#email"
            ><span class="white-text email">jdandturk@gmail.com</span></a
          >
        </div>
      </li>
      <li><a href="perfil.jsp">Perfil</a></li>
      <li><a href="panelPro.jsp">PanelAdmin</a></li>
      <li>
        <div class="divider"></div>
      </li>
      <li><a class="cs" href="logout">Cerrar Sesión</a></li>
    </ul>

    <div class="row container">
      <h2>Confirmacion de Checklist</h2>
      <div class="row">
         <div class="col s12 m5 l7">
            <div class="card-panel white-text  teal lighten-2">${mensaje}</div>
         </div>
      </div>
      <div class="row">
          <div class="col s12 m5 l6">
                <table class="class="highlight">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Check</td>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${lista}" var="list">
                        	<tr>
                            	<td>${list.getId()} </td>
                            	<td>${list.getChek()}</td>
                        	</tr>
                        </c:forEach>
                    </tbody>
                </table>
          </div>
      </div>
      <div class="row">
          <div class="col s12 m5 l6">
            <a class="waves-effect waves-light btn" href="checklist.jsp"><i class="material-icons left">arrow_back</i>Ingresar Otro</a>
          </div>
      </div>
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