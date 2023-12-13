/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.CategoriaProducto;
import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.Producto;
import com.danilore.proyectomoduloinventario.logica.Proveedor;
import com.danilore.proyectomoduloinventario.logica.TipoMoneda;
import com.danilore.proyectomoduloinventario.logica.UnidadMedida;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Danilore
 */
@WebServlet(name = "SvEditarProducto", urlPatterns = {"/SvEditarProducto"})
public class SvEditarProducto extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_editar = request.getParameter("id_productoEdit");

        Producto produ = control.getProducto(id_editar);

        produ = control.getProducto(id_editar);

        HttpSession misesion = request.getSession();
        misesion.setAttribute("editarProducto", produ);

        response.sendRedirect("Vistas/editProducto.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String proveedor = request.getParameter("idProveedor");
        int categoria = Integer.parseInt(request.getParameter("idCategoria"));
        String unidadMedida = request.getParameter("idUnidadMedida");
        Double precio = Double.valueOf(request.getParameter("precio"));
        String tipoMoneda = request.getParameter("idTipoMoneda");
        int estado = 1;

        // Obtener el ID del proveedor del formulario
        String idProveedor = request.getParameter("idProveedor");

        //Consiguiendo objeto proveedor por el id
        Proveedor provee = control.getProveedor(idProveedor);

        provee = control.getProveedor(idProveedor);

        //Consiguiendo objeto categoria por el id
        CategoriaProducto cate = control.getCategoriaProducto(categoria);

        cate = control.getCategoriaProducto(categoria);

        //Consiguiendo objeto unidadMedida por el id
        UnidadMedida uni = control.getUnidadMedida(unidadMedida);

        uni = control.getUnidadMedida(unidadMedida);

        //Consiguiendo objeto tipoMoneda por el id
        TipoMoneda tipo = control.getTipoMoneda(tipoMoneda);

        tipo = control.getTipoMoneda(tipoMoneda);

        if (provee != null) {
            if (cate != null) {
                if (uni != null) {
                    if (tipo != null) {
                        Producto produ = (Producto) request.getSession().getAttribute("editarProducto");
                        produ.setNombre_producto(nombre);
                        produ.setDescripcion_producto(descripcion);
                        produ.setId_proveedor(proveedor);
                        produ.setId_categoria_producto(categoria);
                        produ.setId_unidad_medida(unidadMedida);
                        produ.setPrecio(precio);
                        produ.setId_tipo_moneda(tipoMoneda);
                        produ.setId_estado(estado);

                        control.editProducto(produ);
                        List<Producto> listaProductos = new ArrayList<Producto>();

                        listaProductos = control.listProducto();
                        HttpSession misesion = request.getSession();
                        misesion.setAttribute("listaProductos", listaProductos);
                        response.sendRedirect("Vistas/mostrarProductos.jsp");
                    } else {
                        response.sendRedirect("Vistas/addProducto.jsp?error=tipoMonedaNoExiste");
                    }

                } else {
                    response.sendRedirect("Vistas/addProducto.jsp?error=unidadmedidaNoExiste");
                }

            } else {
                response.sendRedirect("Vistas/addProducto.jsp?error=categoriaproductoNoExiste");
            }

        } else {
            response.sendRedirect("Vistas/addProducto.jsp?error=proveedorNoExiste");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
