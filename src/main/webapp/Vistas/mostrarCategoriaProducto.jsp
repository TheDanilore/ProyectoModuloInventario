<%-- 
    Document   : mostrarCategoriaProducto
    Created on : 9 dic. 2023, 21:16:05
    Author     : Danilore
--%>

<%@page import="java.util.List"%>
<%@page import="com.danilore.proyectomoduloinventario.logica.CategoriaProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorias Registradas</title>
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



                    <font style="color: black;" align="center">
                    <h1>Lista de Categorias de Productos </h1>
                    <br>
                    </font>
                    <div class="row">
                        <div class="col">
                            <center>

                                <a type="button" class="btn btn-primary" href="addCategoriaProducto.jsp">Agregar Nuevo</a>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <button type="button" onclick="window.print()"
                                        style="background-color: green; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;">Imprimir</button>
                            </center>
                        </div>
                    </div>


                    <br>
                    <div class="container ">

                        <table class="table" ID="empleados">
                            <thead class="table-success  ">
                                <tr>
                                    <th>CODIGO</th>
                                    <th>NOMBRE</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>

                            <tbody class="table-light">
                                <%
                                    List<CategoriaProducto> listaCategorias = (List) request.getSession().getAttribute("listaCategoria");

                                    for (CategoriaProducto categoria : listaCategorias) {


                                %>

                                <tr>
                                    <th>
                                        <%=categoria.getId_categoria_producto()%>
                                    </th>
                                    <th>
                                        <%=categoria.getDescripcion()%>
                                    </th>


                                    <th>
                                        <form class="btn btn-info" action="../SvEditarCategoriaProducto" method="GET">
                                            <input type="hidden" name="id_categoriaEdit" value="<%=categoria.getId_categoria_producto()%>">
                                            <button class="btn btn-info"  type="submit">Editar</button>
                                        </form>

                                        <form class="btn btn-danger" action="../SvEliminarCategoriaProducto" method="POST">
                                            <input type="hidden" name="id_categoria" value="<%=categoria.getId_categoria_producto()%>">
                                            <button class="btn btn-danger"  type="submit">Eliminar</button>
                                        </form>

                                    </th>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>


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

