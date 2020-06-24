<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	String usuario ="";
    if(sesion.getAttribute("usuario") != null){
    	usuario = sesion.getAttribute("usuario").toString();
    }else{
    	response.sendRedirect("login.jsp");
    }%>
    <nav class="nav-wrapper blue lighten-1">
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <a href="#" class="brand-logo">Sistema</a>
        <ul id="nav-mobile" class="right  hide-on-med-and-down">
            <li><a href="index.jsp">Inicio</a>< /li>
            <li><a href="perfil.jsp"><%out.print(usuario.toUpperCase());%></a></li>
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
    <div class="container">
        <h3 class="blue white-text">Formulario de Accidente</h3>
        <form action="">
            <div class="row">
                <div class="col s12 l2  blue-grey lighten-5">
                    <input type="text" name="txtserie" readonly>
                    <label for="txtserie">Serie</label>
                </div>
                <div class="col s12 l2  blue-grey lighten-5 ">
                    <input type="text" name="txtfecha" readonly>
                    <label for="txtfecha">Fecha</label>
                </div>
            </div>
            <hr>
            <p><strong>Identificacion del Empleador</strong></p>
            <div class="row">
                <div class="col s12 l6 blue-grey lighten-5">
                    <input type="text" name="txtrazon">
                    <label for="txtrazon">Nombre o Razón Social</label>
                </div>
                <div class="col s12 l4 blue-grey lighten-5">
                    <input type="text" name="txtrutempresa">
                    <label for="txtrutempresa">Rut</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l6 blue-grey lighten-5">
                    <input type="text" name="txtdireccion">
                    <label for="txtdireccion">Direccion/Depto/nro</label>
                </div>
                <div class="col s12 l3 blue-grey lighten-5">
                    <input type="text" name="txtcomempre">
                    <label for="txtcomempre">Comuna</label>
                </div>
                <div class="col s12 l3 blue-grey lighten-5">
                    <input type="text" name="txttel">
                    <label for="txttel">Telefono</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l6 blue-grey lighten-5">
                    <input type="text" name="txtactividad">
                    <label for="txtactividad">Actividad Economica</label>
                </div>
                <div class="col s12 l5 blue-grey lighten-5">
                    <input type="text" name="txtpropiedad">
                    <label for="txtpropiedad">Propiedad de la Empresa</label>
                </div>
            </div>
            <div class="row">
                <p><strong>Tipo de Empresa</strong></p>
                <div class="col s12 l2 blue-grey lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="tipoempresa" type="radio" />
                            <span>Principal</span>
                        </label>
                    </p>
                </div>
                <div class="col s12 l2 blue-grey lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="tipoempresa" type="radio" />
                            <span>Contratista</span>
                        </label>
                    </p>
                </div>
                <div class="col s12 l3 blue-grey lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="tipoempresa" type="radio" />
                            <span>Sub-Contratista</span>
                        </label>
                    </p>
                </div>
                <div class="col s12 l4 blue-grey lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="tipoempresa" type="radio" />
                            <span>Servicios Transitorios</span>
                        </label>
                    </p>
                </div>
            </div>
            <hr>
            <p><strong>Datos de Trabajador</strong></p>
            <div class="row">
                <div class="col s12 l4  blue-grey lighten-5">
                    <input type="text" name="txtnombrestra">
                    <label for="txtnombres">Nombres</label>
                </div>
                <div class="col s12 l4  blue-grey lighten-5 ">
                    <input type="text" name="txtapellidostra">
                    <label for="txtapellidos">Apellidos</label>
                </div>
                <div class="col s12 l4  blue-grey lighten-5 ">
                    <input type="text" name="txtruttra">
                    <label for="txtruttra">Rut</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l6 blue-grey lighten-5">
                    <input type="text" name="txtdirecciontra">
                    <label for="txtdireccion">Direccion/Depto/nro</label>
                </div>
                <div class="col s12 l3 blue-grey lighten-5">
                    <input type="text" name="txtcomtra">
                    <label for="txtcomempre">Comuna</label>
                </div>
                <div class="col s12 l3 blue-grey lighten-5">
                    <input type="text" name="txtteltra">
                    <label for="txttel">Telefono</label>
                </div>
            </div>
            <div class="row">
                <p><strong>Sexo</strong></p>
                <div class="col s12 l2 blue-grey lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="sexo" type="radio" />
                            <span>Hombre</span>
                        </label>
                    </p>
                </div>
                <div class="col s12 l2 blue-grey lighten-5">
                    <p>
                        <label>
                            <input class="with-gap" name="sexo" type="radio" />
                            <span>Mujer</span>
                        </label>
                    </p>
                </div>
                <div class="col s12 l2 blue-grey lighten-5">
                    <input type="number" name="txteda">
                    <label for="txteda">Edad</label>
                </div>
                <div class="col s12 l4 blue-grey lighten-5">
                    <input type="date" name="txtnacimiento" >
                    <label for="txtnacimiento">Edad</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l4 blue-grey lighten-5">
                    <input type="text" name="txtnac">
                    <label for="txtnac">Nacionalidad</label>
                </div>
                <div class="col s12 l3 blue-grey lighten-5">
                    <input type="text" name="txtpro">
                    <label for="txtpro">Profesión</label>
                </div>
            </div>
            <div class="row">
                <div class="col s12 l2 blue-grey lighten-5">
                    <input type="text" name="txtanttra">
                    <label for="txtanttra">Antiguedad Empresa</label>
                </div>
                <div class=" input-field  col s12 l4 blue-grey lighten-5">
                    <select name="tipocontrato" id="">
                        <option value="" disabled selected>Tipo de Contrato</option>
                        <option value="">Plazo Fijo</option>
                        <option value="">Indefinido</option>
                        <option value="">Por obra o Faena</option>
                        <option value="">Trabajador Voluntario</option>
                    </select>
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