<%-- 
    Document   : editSalidaProducto
    Created on : 13 dic. 2023, 05:15:08
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.SalidaProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Categoria</title>
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
                            <h1>Editar Salida de Productos</h1>
                            </font>

                            <form action="../SvEditarSalidaProducto" method="POST">
                                <br>
                                <% SalidaProducto salida = (SalidaProducto) request.getSession().getAttribute("editarSalidaProducto");%>
                                <div class="row">

                                    <!--<div class="col">
                                        <label>RUC Proveedor: </label>
                                        <input type="number" class="form-control mb-3" name="ruc" placeholder="Ruc del Proveedor">
                                    </div>-->
                                    <div class="col">
                                        <label>Producto: </label>
                                        <input type="text" class="form-control mb-3" name="idProducto" value="<%=salida.getId_producto()%>">
                                    </div>
                                    <div class="col">
                                        <label>Cantidad: </label>
                                        <input type="number" class="form-control mb-3" name="cantidad" value="<%=salida.getCantidad()%>">
                                    </div>

                                </div>
                                <div class="row">

                                    <div class="col">
                                        <label>Total (S/): </label>
                                        <input type="number" class="form-control mb-3" name="totalCosto" value="<%=salida.getTotal_costo()%>">

                                    </div>
                                    <div class="col">
                                        <label>Tipo de Moneda: </label>
                                        <input type="text" class="form-control mb-3" name="idTipoMoneda" value="<%=salida.getId_tipo_moneda()%>">

                                    </div>
                                    <div class="col">
                                        <label>N° de Guia: </label>
                                        <input type="text" class="form-control mb-3" name="idGuia" value="<%=salida.getId_guia()%>">
                                    </div>
                                </div>
                                <div class="row">
                                    <label>Nombre del Personal: </label>
                                    <input type="text" class="form-control mb-3" name="nombrePersonal" value="Lorenzo Daniel Arteaga Gordillo">
                                </div>


                                <button type="submit" class="btn btn-primary">Registrar</button>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="mostrarSalidaProducto.jsp"
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