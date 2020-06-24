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
        body {
            background-image: url(https://c.wallhere.com/photos/ce/36/1920x1200_px_General-1197902.jpg!d);
            background-size: cover;
            color: #fff;
        }

        .login {
            margin-top: 100px;
        }

        .login .card {
            background: rgba(0, 0, 0, .6);
        }

        .login label {
            font-size: 16px;
            color: #ccc;
        }

        .login input {
            font-size: 22px !important;
            color: #fff;
        }

        .login button:hover {
            padding: 0px 40px;

        }
    </style>
    <title>Document</title>
</head>

<body>
    <div class="row login">
        <div class="col s12 l4 offset-l4">
            <div class="card">
                <div class="card-action blue white-text">
                    <h3>Login</h3>
                </div>
                <form action="login" method="POST" name="formlogin">
                    <div class="card-content">
                        <div class="form-field">
                            <input id="usuario" name="usuario" type="text" class="validate">
                            <label class="active" for="usuario">Usuario</label>
                        </div><br>
                        <div class="form-field">
                            <input id="contrasena" name="contrasena" type="text" class="validate">
                            <label class="active" for="contrasena">Contrasena</label>
                        </div><br>
                        <div class="form-field">
                            <p>
                                <label>
                                    <input type="checkbox" />
                                    <span>Recuerdame</span>
                                </label>
                            </p>
                        </div><br>
                        <div class="form-field: center-align">
                            <button class="waves-effect waves-light btn-large blue" type="submit">Ingresar</button>
                        </div><br>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script>
        document.addEventListener('DOMContentLoaded', function () {
            M.AutoInit();
        });

    </script>
</body>

</html>