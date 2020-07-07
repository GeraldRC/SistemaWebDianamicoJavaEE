<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <style>
        .cs:hover{
            background-color: #c62828;
            color: whitesmoke;
        }
        .image {
            width: 100%;
            height: auto;
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
            <li><a href="index.jsp">Inicio</a>< /li>
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
        <li><a href="index.jsp">Inicio</a></li>
        <li><a href="perfil.jsp">Perfil</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
        <li>
            <div class="divider"></div>
        </li>
        <li><a class="cs" href="logout">Cerrar Sesión</a></li>
    </ul>

    <div class="container">
        <div class="row">
            <div class="col-s6">
                <div class="card hoverable medium">
                    <div class="card-image">
                       <img class="image" src="http://www.legalium.com/wp-content/uploads/2016/03/accidentes-trafico.gif">
                      <span class="card-title  grey-text text-darken-4">Formulario Accidente</span>
                    </div>
                    <div class="card-content">
                      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptate fugit magni repellat? Dolorum, incidunt atque quos impedit ipsam non delectus commodi natus officiis, ducimus pariatur, aliquam excepturi voluptate obcaecati aut.</p>
                    </div>
                    <div class="card-action">
                      <a class="btn-floating btn-large cyan pulse" href="formAccidente.jsp">Ir</a>
                    </div>
                  </div>
            </div> 
            <div class="col-s6">
                <div class="card hoverable medium">
                    <div class="card-image">
                      <img class="image" src="https://asesorias.com/empresas/wp-content/uploads/2020/01/como-crear-asesoria.jpg">
                      <span class="card-title">Formulario Asesoria</span>
                    </div>
                    <div class="card-content">
                      <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Beatae nisi in quam dolores odit. Ipsam magnam consequuntur est? Adipisci quia corporis vel porro recusandae, quibusdam quaerat perspiciatis voluptatibus ratione quasi.</p>
                    </div>
                    <div class="card-action">
                      <a  class="btn-floating btn-large cyan pulse" href="formVisita.jsp">Ir</a>
                    </div>
                  </div>
            </div>
        </div>
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