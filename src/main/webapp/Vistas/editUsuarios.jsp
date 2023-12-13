<%-- 
    Document   : EditUsuarios
    Created on : 9 dic. 2023, 20:02:06
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
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
                            <h1>Editar Usuario</h1>
                            </font>

                            <form onsubmit="return validarFormulario()" action="../SvEditarUsuario" method="POST">
                                <br>
                                <% Usuario usu = (Usuario) request.getSession().getAttribute("editarUsuario");%>


                                <script>
                                    function validarCorreo() {
                                        var email = document.getElementById("correoUsuario").value;

                                        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

                                        if (!emailRegex.test(email)) {
                                            alert("Ingresa una dirección de correo electrónico válida.");
                                            return false;
                                        }

                                        return true;
                                    }

                                    function validarFormulario() {

                                        return validarCorreo();
                                    }
                                </script>

                                <div class="col">
                                    <label>Correo: </label>
                                    <input type="email" class="form-control mb-3" id="correoUsuario" name="correoUsuario" value="<%=usu.getCorreo_usuario()%>" required>
                                </div>
                                <div class="row">

                                    <div class="col">
                                        <label>Contraseña </label>
                                        <input type="password" class="form-control mb-3" name="contraUsuario" value="<%=usu.getContra_usuario()%>" required>
                                    </div>
                                    <div class="col">
                                        <label>Cargo: </label>
                                        <input type="number" class="form-control mb-3" name="idCargo" value="<%=usu.getId_cargo()%>" required>

                                    </div>

                                </div>

                                <button type="submit" class="btn btn-primary">Guardar</button>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="mostrarUsuarios.jsp"
                                   class="btn btn-danger">Cancelar</a>
                            </form>

                        </center>
                        <br><br><br><br><br><br>

                        <form class="btn btn-primary" action="../SvActivarUsuario" method="POST">
                            <input type="hidden" name="id_usuario" value="<%=usu.getId_usuario()%>">
                            <button class="btn btn-primary"  type="submit">Activar</button>
                        </form> 
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


