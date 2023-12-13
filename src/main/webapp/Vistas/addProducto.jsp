<%-- 
    Document   : addProducto
    Created on : 9 dic. 2023, 23:30:39
    Author     : Danilore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Producto</title>
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
                                <h1>Registrar Producto</h1>
                                </font>

                                <form action="../SvProductos" method="POST">
                                    <br>

                                    <div class="col">
                                        <label>Nombre: </label>
                                        <input type="text" class="form-control mb-3" name="nombre" placeholder="Nombres del Producto">
                                    </div>
                                    <div class="col">
                                        <label>Descripcion: </label>
                                        <input type="text" class="form-control mb-3" name="descripcion" placeholder="Descripcion">
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <label>Proveedor: </label>
                                            <input type="text" class="form-control mb-3" name="idProveedor" placeholder="Proveedor">
                                        </div>
                                        <div class="col">
                                            <label>Categoria: </label>
                                            <input type="number" class="form-control mb-3" name="idCategoria" placeholder="Categoria">

                                        </div>
                                        <div class="col">
                                            <label>Unidad de Medida: </label>
                                            <input type="text" class="form-control mb-3" name="idUnidadMedida" placeholder="Unidad de Medida">

                                        </div>

                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <label>Precio: </label>
                                            <input type="text" class="form-control mb-3" name="precio" placeholder="Precio">

                                        </div>
                                        <div class="col">
                                            <label>Moneda: </label>
                                            <input type="text" class="form-control mb-3" name="idTipoMoneda" placeholder="Tipo de Moneda">

                                        </div>

                                    </div>

                                    <button type="submit" class="btn btn-primary">Registrar</button>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="mostrarProductos.jsp"
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

