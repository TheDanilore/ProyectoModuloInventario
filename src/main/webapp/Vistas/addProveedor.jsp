<%-- 
    Document   : addProveedor
    Created on : 10 dic. 2023, 15:48:40
    Author     : Danilore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Proveedor</title>
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
                            <h1>Registrar Proveedor</h1>
                            </font>

                            <form onsubmit="return validarFormulario()" action="../SvProveedor" method="POST">
                                <br>

                                <div class="row">
                                    <script>
                                        function validarFormulario() {
                                            var ruc = document.getElementById("rucProveedor").value;
                                            var telefono = document.getElementById("telefonoProveedor").value;

                                            // Valida el RUC, si es tiene 11 caracteres numéricos
                                            if (!/^\d{11}$/.test(ruc)) {
                                                alert("Ingresa un RUC válido de 11 dígitos numéricos.");
                                                return false; // no se envia el formulario si la validación falla
                                            }

                                            // Valida el teléfono, si tiene números, espacios y/o símbolo '+'
                                            if (!/^[\d+ ]+$/.test(telefono)) {
                                                alert("Ingresa un número de teléfono válido.");
                                                return false; // Evitar el envío del formulario si la validación falla
                                            }

                                            // Eliminar espacios del teléfono antes de enviar el formulario
                                            document.getElementById("telefono").value = telefono.replace(/\s+/g, '');

                                            return true; // Enviar el formulario si la validación es exitosa
                                        }
                                    </script>
                                    <div class="col">
                                        <label>RUC: </label>
                                        <input type="text" class="form-control mb-3" id="rucProveedor" name="rucProveedor" placeholder="RUC" required>
                                    </div>

                                    <div class="col">
                                        <label>Razon Social: </label>
                                        <input type="text" class="form-control mb-3" name="razonProveedor" placeholder="Razon Social" required>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col">
                                        <label>Dirección: </label>
                                        <input type="text" class="form-control mb-3" name="direccionProveedor" placeholder="Ubicacion del Proveedor" required>
                                    </div>
                                    <div class="col">
                                        <label>Telefono: </label>
                                        <input type="text" class="form-control mb-3" id="telefonoProveedor" name="telefonoProveedor" placeholder="Numero de Telefono" required>
                                    </div>

                                </div>

                                <button type="submit" class="btn btn-primary">Registrar</button>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="mostrarProveedor.jsp"
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

