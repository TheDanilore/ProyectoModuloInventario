/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.Kardex;
import com.danilore.proyectomoduloinventario.logica.Producto;
import com.danilore.proyectomoduloinventario.logica.TipoMoneda;
import com.danilore.proyectomoduloinventario.logica.TipoMovimiento;
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
@WebServlet(name = "SvKardex", urlPatterns = {"/SvKardex"})
public class SvKardex extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Kardex> lista = new ArrayList<Kardex>();

        lista = control.listKardex();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaKardex", lista);

        response.sendRedirect("Vistas/mostrarKardex.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("idProducto");
        String texto = request.getParameter("tipoMovimiento"); // El String con un solo carácter
        char tipoMovimiento = texto.charAt(0);
        long cantidad = Long.parseLong(request.getParameter("cantidad"));
        String tipoMoneda = request.getParameter("idTipoMoneda");
        double totalCosto = Double.parseDouble(request.getParameter("costoTotal"));
        long existencias = Long.parseLong(request.getParameter("existencias"));

        //long ruc = Long.parseLong(request.getParameter("ruc"));
        //Consiguiendo objeto producto por el id
        Producto produ = control.getProducto(producto);

        produ = control.getProducto(producto);

        //Consiguiendo objeto tipoMovimiento por el id
        TipoMovimiento tipoMov = control.getTipoMovimiento(tipoMovimiento);

        tipoMov = control.getTipoMovimiento(tipoMovimiento);

        //Consiguiendo objeto tipoMoneda por el id
        TipoMoneda tipo = control.getTipoMoneda(tipoMoneda);

        tipo = control.getTipoMoneda(tipoMoneda);

        if (produ != null) {
            if (tipoMov != null) {
                if (tipo != null) {
                    Kardex kardex = new Kardex();
                    kardex.setId_producto(producto);
                    kardex.setId_tipo_movimiento(tipoMovimiento);
                    kardex.setCantidad_movimiento(cantidad);
                    kardex.setId_tipo_moneda(tipoMoneda);
                    kardex.setCosto_total(totalCosto);
                    kardex.setExistencias_productos(existencias);
                    control.crearKardex(kardex);

                    List<Kardex> lista = new ArrayList<Kardex>();

                    lista = control.listKardex();

                    HttpSession misesion = request.getSession();
                    misesion.setAttribute("listaKardex", lista);

                    response.sendRedirect("Vistas/mostrarKardex.jsp");
                } else {
                    response.sendRedirect("Vistas/addKardex.jsp?error=tipoMonedaNoExiste");
                }
            } else {
                response.sendRedirect("Vistas/addKardex.jsp?error=tipomovimientoNoExiste");
            }

        } else {
            response.sendRedirect("Vistas/addKardex.jsp?error=productoNoExiste");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
