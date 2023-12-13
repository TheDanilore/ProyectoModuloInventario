<%-- 
    Document   : Empleado
    Created on : 11 dic 2023, 1:02:26
    Author     : rv_al
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Ventana Administrativa/Empleado</title>
        <!-- Agrega el enlace al CDN de Bootstrap -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Vincula la hoja de estilo personalizada -->
        <link rel="stylesheet" type="text/css" href="Estilos/Estilos_Principal.css">
        <style>

        </style>
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <!-- Menú lateral -->
                <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <div class="sidebar-sticky">
                        <ul class="nav flex-column">
                            <br><br><br><br><br><br><br>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion1">
                                    Principal
                                </a>
                                <div id="opcion1" class="collapse">
                                    <!-- Subopciones de la Opción 1 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="Principal.jsp">Principal</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <!-- Opción 1 del acordeón -->
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion2">
                                    Empleado
                                </a>
                                <div id="opcion2" class="collapse">
                                    <!-- Subopciones de la Opción 1 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="Empleado.jsp">Registrar</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Listar</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <!-- Opción 2 del acordeón -->
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion3">
                                    Empleados 
                                </a>
                                <div id="opcion3" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Registrar</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Listar</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <!-- Nueva opción en el menú -->
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion4">
                                    Clientes  
                                </a>
                                <div id="opcion4" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Subopción 2.1</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Subopción 2.2</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion5">
                                    Clientes  
                                </a>
                                <div id="opcion5" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Subopción 2.1</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Subopción 2.2</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion6">
                                    Clientes  
                                </a>
                                <div id="opcion6" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Subopción 2.1</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Subopción 2.2</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>

                        <!-- Botón de cerrar sesión -->
                        <button class="btn btn-danger mt-4 logout-button">Cerrar Sesión</button>
                    </div>
                </nav>

                <!-- Contenido principal -->
                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <!-- Resto del contenido de la página -->
                    <center>
                        <h1>Bienvenidos al Modulo de Inventario</h1>
                        <h1>Ramirez-Arteaga-Angulo</h1>
                        <img src="Imagenes/gestion-de-materiales.png" alt="Logo de la empresa" class="logo-img">
                    </center>

                    <div class="container mt-4">
                        <h1>Registro de Empleado</h1>

                        <!-- Formulario de Registro -->
                        <form action="ProcesarRegistroServlet" method="post">
                            <div class="form-row">
                                <div class="form-group col-md-2">
                                    <label for="id">ID</label>
                                    <input type="text" class="form-control" id="id" name="id">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="primerNombre">Primer Nombre</label>
                                    <input type="text" class="form-control" id="primerNombre" name="primerNombre">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="segundoNombre">Segundo Nombre</label>
                                    <input type="text" class="form-control" id="segundoNombre" name="segundoNombre">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="apellidoPaterno">Apellido Paterno</label>
                                    <input type="text" class="form-control" id="apellidoPaterno" name="apellidoPaterno">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="apellidoMaterno">Apellido Materno</label>
                                    <input type="text" class="form-control" id="apellidoMaterno" name="apellidoMaterno">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="telefono">Teléfono</label>
                                    <input type="text" class="form-control" id="telefono" name="telefono">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="tipoDocumento">Tipo de Documento</label>
                                    <select class="form-control" id="tipoDocumento" name="tipoDocumento">
                                        <!-- Agrega opciones según tus necesidades -->
                                        <option value="DNI">DNI</option>
                                        <option value="Pasaporte">Pasaporte</option>
                                        <!-- ... -->
                                    </select>
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="numeroDocumento">Nº Documento</label>
                                    <input type="text" class="form-control" id="numeroDocumento" name="numeroDocumento">
                                </div>
                                <div class="form-group col-md-2">
                                    <label for="idUsuario">ID Usuario</label>
                                    <input type="text" class="form-control" id="idUsuario" name="idUsuario">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary">Registrar</button>
                        </form>

                        <!-- Lista de Usuarios Registrados -->
                        <div class="mt-4">
                            <!-- Agrega una tabla o lista para mostrar los usuarios registrados -->
                            <!-- ... -->
                        </div>

                        <!-- Botones de Paginación -->
                        <div class="mt-4">
                            <!-- Agrega botones de paginación según tus necesidades -->
                            <!-- ... -->
                        </div>
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


