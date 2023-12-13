<%-- 
    Document   : AddUsuarios
    Created on : 9 dic. 2023, 22:53:20
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.Controladora"%>
<%@page import="com.danilore.proyectomoduloinventario.logica.Cargo"%>
<%@page import="java.util.List"%>
<%@page import="com.danilore.proyectomoduloinventario.logica.CategoriaProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="../css/Estilos_Principal.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="../css/header.css" rel="stylesheet" />
    </head>
    <body>



        <div class="container-fluid">
            <div class="row">
<%@include file="../components/menu.jsp" %>
                <!-- Contenido principal -->
                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <!-- Resto del contenido de la página -->
                    <center>
                        <header class="nom-empre">

                            <h1 class="agroarte">Modulo de Inventario</h1>

                        </header>
                    </center>

                    <br><br><br><br><br>

                    <div class="container ">
                            <center>
                                <font style="color: black;" align="center">
                                <h1>Registrar Usuarios</h1>
                                </font>

                                <form action="../SvUsuarios" method="POST">
                                    <br>

                                    <div class="col">
                                        <label>Correo: </label>
                                        <input type="text" class="form-control mb-3" name="correoUsuario" placeholder="CORREO">
                                    </div>
                                    <div class="row">

                                        <div class="col">
                                            <label>Contraseña </label>
                                            <input type="text" class="form-control mb-3" name="contraUsuario" placeholder="Contraseña">
                                        </div>
                                        <div class="col">
                                            <label>Cargo: </label>
                                            <input type="number" class="form-control mb-3" name="idCargo" placeholder="Cargo">

                                        </div>

                                    </div>

                                    <button type="submit" class="btn btn-primary">Registrar</button>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="mostrarUsuarios.jsp"
                                       class="btn btn-danger">Cancelar</a>
                                </form>

                            </center>
                    </div>





                </main>
            </div>
        </div>

        <!-- JavaScript y jQuery necesarios para Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>



    </body>
</html>

