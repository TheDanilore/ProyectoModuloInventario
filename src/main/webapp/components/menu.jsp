<%-- 
    Document   : menu
    Created on : 13 dic. 2023, 03:25:23
    Author     : Danilore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Validacion de la Sesion-->
        <% HttpSession misession = request.getSession();
            String usuario = (String) request.getSession().getAttribute("usuario");

            if (usuario == null) {
                response.sendRedirect("sinLogin.jsp");
            }

        %>

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
                                            <a class="nav-link" href="../index.jsp">Principal</a>
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
                                            <a class="nav-link" href="../SvIngresoProducto">Productos Recibidos</a>
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
                                            <a class="nav-link" href="../SvSalidaProducto">Lista de Salidas</a>
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
                                            <a class="nav-link" href="../SvKardex">Existencias</a>
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
                                            <a class="nav-link" href="../SvProveedor">Proveedores</a>
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
                                            <a class="nav-link" href="../SvProductos">Productos</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../SvCategoriaProducto">Categorias</a>
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
                                            <a class="nav-link" href="../SvUsuarios">Usuarios</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../SvCargo">Cargos</a>
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
                                            <a class="nav-link" href="../SvCategoriaProducto">Cerrar Sesión</a>
                                            <button class="btn btn-danger mt-4 logout-button">Cerrar Sesión</button>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>

                        
                        
                    </div>
                </nav>
