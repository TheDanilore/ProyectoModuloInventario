<%-- 
    Document   : editIngresoProducto
    Created on : 13 dic. 2023, 04:40:04
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.IngresoProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Producto</title>
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
                            <h1>Editar Ingreso de Producto</h1>
                            </font>

                            <form onsubmit="return validarFormulario()" action="../SvEditarIngresoProducto" method="POST">
                                <br>
                                <% IngresoProducto ingreso = (IngresoProducto) request.getSession().getAttribute("editarIngresoProducto");%>
                                <div class="row">

                                    <!--<div class="col">
                                        <label>RUC Proveedor: </label>
                                        <input type="number" class="form-control mb-3" name="ruc" placeholder="Ruc del Proveedor">
                                    </div>-->
                                    <div class="col">
                                        <label>Producto: </label>
                                        <input type="text" class="form-control mb-3" name="idProducto" value="<%=ingreso.getId_producto()%>" required>
                                    </div>

                                    <script>

                                        function validarFormulario() {
                                            var cantidad = document.getElementById("cantidad").value;
                                            var total = document.getElementById("totalCosto").value;

                                            // Verificar si el valor es un número y mayor que cero
                                            if (isNaN(cantidad) || cantidad <= 0) {
                                                alert("Ingresa una cantidad mayor a 0.");
                                                return false; // Evitar el envío del formulario si la validación falla
                                            }
                                            if (isNaN(total) || total <= 0) {
                                                alert("Ingresa un total mayor a 0.");
                                                return false; // Evitar el envío del formulario si la validación falla
                                            }
                                            return true; // Enviar el formulario si la validación es exitosa
                                        }
                                    </script>
                                    <div class="col">
                                        <label>Cantidad: </label>
                                        <input type="number" class="form-control mb-3" id="cantidad" name="cantidad" value="<%=ingreso.getCantidad()%>" required>
                                    </div>

                                </div>
                                <div class="row">

                                    <div class="col">
                                        <label>Total (S/): </label>
                                        <input type="number" class="form-control mb-3" id="totalCosto" name="totalCosto" value="<%=ingreso.getTotal_costo()%>" required>

                                    </div>
                                    <div class="col">
                                        <label>Tipo de Moneda: </label>
                                        <input type="text" class="form-control mb-3" name="idTipoMoneda" value="<%=ingreso.getId_tipo_moneda()%>" required>

                                    </div>
                                    <div class="col">
                                        <label>N° de Guia: </label>
                                        <input type="text" class="form-control mb-3" name="idGuia" value="<%=ingreso.getId_guia()%>" required>
                                    </div>
                                </div>
                                <div class="row">
                                    <label>Nombre del Personal: </label>
                                    <input type="text" class="form-control mb-3" name="nombrePersonal" value="Lorenzo Daniel Arteaga Gordillo" required>
                                </div>


                                <button type="submit" class="btn btn-primary">Guardar</button>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="mostrarIngresoProducto.jsp"
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

