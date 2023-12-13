<%-- 
    Document   : mostrarProveedor
    Created on : 10 dic. 2023, 15:46:35
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.Proveedor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proveedores Registrados</title>
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
                    <h1>Lista de Proveedores </h1>
                    <br>
                    </font>
                    <div class="row">
                        <div class="col">
                            <center>

                                <a type="button" class="btn btn-primary" href="addProveedor.jsp">Agregar Nuevo</a>
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
                                    <th>RUC</th>
                                    <th>RAZON SOCIAL</th>
                                    <th>DIRECCIÓN</th>
                                    <th>TELEFONO</th>
                                    <th>ESTADO</th>
                                    <th>FECHA DE CREACIÓN</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>

                            <tbody class="table-light">
                                <%
                                    List<Proveedor> listaProveedor = (List) request.getSession().getAttribute("listaProveedor");

                                    for (Proveedor proveedor : listaProveedor) {


                                %>

                                <tr>
                                    <th>
                                        <%=proveedor.getId_proveedor()%>
                                    </th>
                                    <th>
                                        <%=proveedor.getRuc()%>
                                    </th>
                                    <th>
                                        <%=proveedor.getRazon_social()%>
                                    </th>
                                    <th>
                                        <%=proveedor.getDireccion()%>
                                    </th>
                                    <th>
                                        <%=proveedor.getTelefono()%>
                                    </th>
                                    <th>
                                        <%=proveedor.getId_estado()%>
                                    </th>
                                    <th>
                                        <%=proveedor.getFecha_creacion()%>
                                    </th>

                                    <th>
                                        <form class="btn btn-info" action="../SvEditarProveedor" method="GET">
                                            <input type="hidden" name="id_proveedorEdit" value="<%=proveedor.getId_proveedor()%>">
                                            <button class="btn btn-info"  type="submit">Editar</button>
                                        </form>
                                        <form class="btn btn-danger" action="../SvActivarProveedor" method="POST">
                                            <input type="hidden" name="id_proveedor" value="<%=proveedor.getId_proveedor()%>">
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

