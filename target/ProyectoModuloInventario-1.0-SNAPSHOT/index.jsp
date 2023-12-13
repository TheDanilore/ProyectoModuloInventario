<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Modulo de Inventario</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Vincula la hoja de estilo personalizada -->
        <link rel="stylesheet" type="text/css" href="css/Estilos_Principal.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/estilos-principal.css" rel="stylesheet" />
        <link href="css/header.css" rel="stylesheet" />
    </head>
    <body>
        <!--Validacion de la Sesion-->
        <% HttpSession misession = request.getSession();
            String usuario = (String) request.getSession().getAttribute("usuario");

            if (usuario == null) {
                response.sendRedirect("sinLogin.jsp");
            }

        %>

        <div class="container-fluid">
            <div class="row">
                <!-- Menú lateral -->
                <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <div class="sidebar-sticky">
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <br><br><br><br><br><br><br>
                                <a class="nav-link" data-toggle="collapse" href="#opcion1">
                                    Principal
                                </a>
                                <div id="opcion1" class="collapse">
                                    <!-- Subopciones de la Opción 1 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="index.jsp">Principal</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <!-- Opción 1 del acordeón -->
                            <li class="nav-item">

                                <a class="nav-link" data-toggle="collapse" href="#opcion2">
                                    Productos Recibidos
                                </a>
                                <div id="opcion2" class="collapse">
                                    <!-- Subopciones de la Opción 1 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvIngresoProducto">Productos Recibidos</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">

                                <a class="nav-link" data-toggle="collapse" href="#opcion3">
                                    Lista de Salidas
                                </a>
                                <div id="opcion3" class="collapse">
                                    <!-- Subopciones de la Opción 1 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvSalidaProducto">Lista de Salidas</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <!-- Opción 2 del acordeón -->
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion4">
                                    Existencias
                                </a>
                                <div id="opcion4" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvKardex">Existencias</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <!-- Nueva opción en el menú -->
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion5">
                                    Proveedores  
                                </a>
                                <div id="opcion5" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvProveedor">Proveedores</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion6">
                                    Productos  
                                </a>
                                <div id="opcion6" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvProductos">Productos</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvCategoriaProducto">Categorias</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion7">
                                    Usuarios
                                </a>
                                <div id="opcion7" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvUsuarios">Usuarios</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="SvCargo">Cargos</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="collapse" href="#opcion8">
                                    Perfil  
                                </a>
                                <div id="opcion8" class="collapse">
                                    <!-- Subopciones de la Opción 2 -->
                                    <ul class="nav flex-column ml-3">
                                        <li class="nav-item">
                                            <a class="nav-link" href="#"></a>
                                        </li>
                                        <li class="nav-item">
                                            <!--<a class="nav-link" href="../SvCategoriaProducto">Cerrar Sesión</a>-->
                                            <button class="btn btn-danger mt-4 logout-button">Cerrar Sesión</button>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>

                    </div>
                </nav>
                <!-- Contenido principal -->
                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <!-- Resto del contenido de la página -->
                    <center>
                        <header class="nom-empre">

                            <h1 class="agroarte">Modulo de Inventario</h1>

                        </header>
                    </center>

                    <br><br><br><br><br>

                    <center>

                        <div class="dialogo">
                            <div class="titulo">¿QUIÉNES SOMOS?</div>
                            <div class="descripcion">
                                3 años de crecimiento sostenido y sustentable en el sector Agropecuario a través de sus empresas
                                <strong>Agro-Arteaga Hermanos</strong>. Somos el grupo
                                líder en protección vegetal del sector agrícola nacional.
                            </div>
                        </div>
                    </center>


                    <br><br><br><br>



                    <div class="contenedor">
                        <div class="nube">
                            <div class="titulo">MISION</div>
                            <p>Aliado estratégico de nuestros clientes brindando soluciones que generen cultivos
                                más sanos y productivos, a través de la innovación y el cuidado del medio ambiente..</p>
                            <!--<center><img class="imagen"  src="../java/Imagenes/GRANJERO.png" alt=""/></center>-->
                        </div>




                        <div class="nube">
                            <div class="titulo">VISION</div>
                            <p>Ser elegida como la mejor propuesta de valor integral en protección vegetal
                                sostenible en el Perú y expandirnos internacionalmente.</p>
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


