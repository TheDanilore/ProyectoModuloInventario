<%-- 
    Document   : editCargo
    Created on : 10 dic. 2023, 14:46:21
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.Cargo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Cargo</title>
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
                                <h1>Editar Cargo de Empleados</h1>
                                </font>

                                <form action="../SvEditarCargo" method="POST">
                                    <br>
                                    <% Cargo cargoObj = (Cargo) request.getSession().getAttribute("editarCargo");%>
                                    <div class="col">
                                        <label>Descripcion: </label>
                                        <input type="text" class="form-control mb-3" name="descripcionCargo" value="<%=cargoObj.getDescripcion()%>" required>
                                    </div>


                                    <button type="submit" class="btn btn-primary">Guardar</button>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="mostrarCargo.jsp"
                                       class="btn btn-danger">Cancelar</a>
                                </form>

                            </center>
                                    <br><br><br><br><br><br>
                                    <form class="btn btn-primary" action="../SvActivarCargo" method="POST">
                                            <input type="hidden" name="id_cargo" value="<%=cargoObj.getId_cargo()%>">
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



