<%-- 
    Document   : Login
    Created on : 5 dic 2023, 20:02:14
    Author     : rv_al
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <title>Iniciar Sesion</title>
    <style>
        body {
            background-image: url('Imagenes/Fondo-almacen.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            align-items: center;
        }
        .card {
            background-color: rgba(255, 255, 255, 0.6);
            border-radius: 20px;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <img src="Imagenes/perfil.png" alt="Logo de la empresa" class="logo-img">
                    <h1 class="card-title text-center">LOGIN</h1>
                    <form action="SvLogin" method="POST">
                        <div class="form-group">
                            <label for="correo"><strong>Correo:</strong></label>
                            <input type="text" class="form-control" id="correo" name="correo" style="width: 60%; margin: 0 auto;" placeholder="Correo Electronico"  required>
                        </div>
                        <div class="form-group">
                            <label for="contra"><strong>Contraseña:</strong></label>
                            <input type="password" class="form-control" id="contra" name="contra" style="width: 60%; margin: 0 auto;" placeholder="Contraseña" required>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block" style="width: 30%; margin: 0 auto;">Ingresar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

</body>
</html>
