<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <style>
        .cs:hover {
            background-color: #c62828;
            color: whitesmoke;
        }

        div .col {
            border-radius: 20px;
        }
    </style>
    <title>Visita</title>
</head>

<body>
   <% HttpSession sesion = request.getSession(); 
	String rol ="";
    if(sesion.getAttribute("rol") != null){
    	rol = sesion.getAttribute("rol").toString();
    }else{
    	response.sendRedirect("login.jsp");
    }%>
    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="perfil.jsp"><%out.print(rol.toUpperCase());%></a></li>
            <li><a href="collapsible.html">JavaScript</a></li>
            <li><a class="cs" href="logout">Cerrar Sesión</a></li>
        </ul>
    </nav>
    <ul id="slide-out" class="sidenav">
        <li>
            <div class="user-view">
                <div class="background">
                    <img src="https://picsum.photos/300/300?random=1">
                </div>
                <a href="#user"><img class="circle" src="https://picsum.photos/200/300?random=2"></a>
                <a href="perfil.jsp"><span class="white-text name">John Doe</span></a>
                <a href="#email"><span class="white-text email">jdandturk@gmail.com</span></a>
            </div>
        </li>
        <li><a href="index.html">Inicio</a></li>
        <li><a href="perfil.jsp">Perfil</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
        <li>
        <div class="divider"></div>
        </li>
        <li><a class="cs" href="logout">Cerrar Sesión</a></li>
    </ul>
    <c:if test="${mensaje != null}">
		<c:out value="${mensaje}" />
    </c:if>
    
    <div class="container">
        <h3 class="blue white-text">Formulario de Accidente</h3>
        <form action="accidente" method="post">
            <p><strong>Identificacion del Empleador</strong></p>
            <div class="row">
            	<div class="col s12 l4 green lighten-5">
            		<input type="number" name="txtserie" required  class="validate" maxlength="38">
                    <label for="txtserie">Ingrese Folio de Accidente (*)</label>
            	</div>
            </div>
            <div class="row">
                <div class="col s12 l6 green lighten-5">
                    <input type="text" name="txtrazon" value="${cliente.razonsocial}" readonly />
                    <label for="txtrazon">Nombre o Razón Social</label>
                </div>
                <div class="col s12 l4 green lighten-5">
                    <input type="text" name="txtrucliente" value="${cliente.rut}" readonly/>
                    <label for="txtrutempresa">Rut</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l6 green lighten-5">
                    <input type="text" name="txtdireccion" value="${cliente.direccion}" readonly/>
                    <label for="txtdireccion">Direccion/Depto/nro</label>
                </div>
                <div class="col s12 l3 green lighten-5">
                    <input type="text" name="txtcomempre" value="${cliente.comuna}" readonly/>
                    <label for="txtcomempre">Comuna</label>
                </div>
                <div class="col s12 l3 green lighten-5">
                    <input type="text" name="txttel" value="${cliente.telefono}" readonly/>
                    <label for="txttel">Telefono</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l6 green lighten-5">
                    <input type="text" name="txtactividad" value="${cliente.acteconomica}" readonly/>
                    <label for="txtactividad">Actividad Economica</label>
                </div>
            </div>
            <div class="row">
                <p><strong>Tipo de Empresa</strong></p>
                <div class="col s12 l2 green lighten-5">
                     <input type="text" name="txttipempresa" value="${cliente.tipoEmpresa}" readonly/>
                    <label for="txttipempresa">Tipo de Empresa</label>
                </div>
            </div>
            <hr>
            <p><strong>Datos de Trabajador</strong></p>
            <div class="row">
                <div class="col s12 l4  green lighten-5">
                    <input type="text" name="txtnombrestra" required maxlength="50" class="validate">
                    <label for="txtnombres">Nombres (*)</label>
                </div>
                <div class="col s12 l4  green lighten-5 ">
                    <input type="text" name="txtruttra" required maxlength="13" class="validate">
                    <label for="txtruttra">Rut (*)</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l6 green lighten-5">
                    <input type="text" name="txtdirecciontra" required maxlength="100" class="validate">
                    <label for="txtdirecciontra">Direccion/Depto/nro (*)</label>
                </div>
                <div class="col s12 l3 green lighten-5">
                    <input type="text" name="txtcomtra" required maxlength="100" class="validate">
                    <label for="txtcomtra">Comuna (*)</label>
                </div>
                <div class="col s12 l3 green lighten-5">
                    <input type="text" name="txtteltra" required maxlength="9" class="validate"> 
                    <label for="txtteltra">Telefono (*)</label>
                </div>
            </div>
            <div class="row">
                <p><strong>Sexo (*)</strong></p>
                <div class="col s12 l2 green lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="sexo" type="radio"  value="Masculino" checked/>
                            <span>Masculino</span>
                        </label>
                    </p>
                </div>
                <div class="col s12 l2 green lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="sexo" type="radio" value="Femenino" />
                            <span>Femenino</span>
                        </label>
                    </p>
                </div>
            </div>    
                <div class="row">
	                <div class="col s12 l4 ">
	                    <button class="btn waves-effect waves-light" type="submit" name="action">Enviar Reporte
	    					<i class="material-icons right">send</i>
	 					 </button>
	                </div>
                </div>
            </div>
        </form>
    </div>
   

    <!- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                M.AutoInit();
            });

        </script>
</body>

</html>