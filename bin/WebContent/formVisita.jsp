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
        .cs:hover {
            background-color: #c62828;
            color: whitesmoke;
        }

        #formaccidente {
            border-radius: 5px;
            margin-top: 10px;
        }
        .image{
            width: 100%;
            height: auto;
        }
    </style>
    <title>Asesoria</title>
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
        <div class="row">
            <article id="formaccidente" class="col s12 m12 l12 ">
                <h3 class="center-align">ASESORIA</h3>
                <img  class="image" src="https://advisorchile.cl/wp-content/uploads/2017/12/financiero-header.jpg" alt="accidente">
                <form method="POST" action="accidente">
                    <div class="input-field">
                        <i class="material-icons prefix">perm_identity</i>
                        <label for="nombre">Nombre</label>
                        <input type="text" name="nombre" required>
                    </div>

                    <div class="input-field">
                        <i class="material-icons prefix">person_pin</i>
                        <label for="apellido">Apellido</label>
                        <input type="text" name="apellido" required>
                    </div>

                    <div class="input-field">
                        <i class="material-icons prefix">accessibility
                        </i>
                        <select name="opaccidente">
                            <option value="" disabled selected>Seleccione Tipo De Accidente</option>
                            <option value="">Caida</option>
                            <option value="">Quemadura</option>
                            <option value="">Atropello</option>
                        </select>
                    </div>
                    <div class="input-field">
                        <p>
                            <label>
                              <input class="with-gap" name="group3" type="radio" checked />
                              <span>Trabajador</span>
                            </label>
                          </p>
                          <p>
                            <label>
                              <input class="with-gap" name="group3" type="radio"/>
                              <span>Administrativo</span>
                            </label>
                          </p>
                    </div>
                    <div class="input-field">
                        <i class="material-icons prefix">mode_edit</i>
                        <label for="mensaje">Descripción</label>
                        <textarea name="mensaje" id="" rows="10" class="materialize-textarea" length="140"
                            required></textarea>
                    </div>

                    <p class="center-align">
                        <button class="waves-effect waves-light btn" type="submit"><i
                                class="material-icons right">send</i>enviar</button>
                    </p>

                </form>

            </article>
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