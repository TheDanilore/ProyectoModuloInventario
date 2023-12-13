<%-- 
    Document   : mostrarProductos
    Created on : 9 dic. 2023, 20:35:00
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos Registrados</title>
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
                    <h1>Lista de Productos Registrados </h1>
                    <br>
                    </font>
                    <div class="row">
                        <div class="col">
                            <center>

                                <a type="button" class="btn btn-primary" href="addProducto.jsp">Agregar Nuevo</a>
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
                                        <th>DESCRIPCION</th>
                                        <th>PROVEEDOR</th>
                                        <th>CATEGORIA</th>
                                        <th>UNIDAD DE MEDIDA</th>
                                        <th>PRECIO</th>
                                        <th>MONEDA</th>
                                        <th>ESTADO</th>
                                        <th>FECHA DE CREACIÓN</th>
                                        <th>Acciones</th>
                                    </tr>
                                </thead>

                                <tbody class="table-light">
                                    <%
                                        List<Producto> listaProductos = (List) request.getSession().getAttribute("listaProductos");

                                        for (Producto pro : listaProductos) {


                                    %>

                                    <tr>
                                        <th>
                                            <%=pro.getId_producto()%>
                                        </th>
                                        <th>
                                            <%=pro.getNombre_producto()%>
                                        </th>
                                        <th>
                                            <%=pro.getDescripcion_producto()%>
                                        </th>
                                        <th>
                                            <%=pro.getId_proveedor()%>
                                        </th>
                                        <th>
                                            <%=pro.getId_categoria_producto()%>
                                        </th>
                                        <th>
                                            <%=pro.getId_unidad_medida()%>
                                        </th>
                                        <th>
                                            <%=pro.getPrecio()%>
                                        </th>
                                        <th>
                                            <%=pro.getId_tipo_moneda()%>
                                        </th>
                                        <th>
                                            <%=pro.getId_estado()%>
                                        </th>
                                        <th>
                                            <%=pro.getFecha_creacion()%>
                                        </th>


                                        <th>
                                            <form class="btn btn-info" action="../SvEditarProducto" method="GET">
                                                <input type="hidden" name="id_productoEdit" value="<%=pro.getId_producto()%>">
                                                <button class="btn btn-info"  type="submit">Editar</button>
                                            </form>
                                            <form class="btn btn-danger" action="../SvBajaProducto" method="POST">
                                                <input type="hidden" name="id_producto" value="<%=pro.getId_producto()%>">
                                                <button class="btn btn-danger"  type="submit">Dar de Baja</button>
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
