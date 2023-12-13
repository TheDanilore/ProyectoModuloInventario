package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.GuiaRemisionEntrada;
import com.danilore.proyectomoduloinventario.logica.IngresoProducto;
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
@WebServlet(name = "SvIngresoProducto", urlPatterns = {"/SvIngresoProducto"})
public class SvIngresoProducto extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<IngresoProducto> listaIngresoProducto = new ArrayList<IngresoProducto>();
        
        listaIngresoProducto = control.listIngresoProducto();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaIngresoProducto",listaIngresoProducto);
        
        response.sendRedirect("Vistas/mostrarIngresoProducto.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("idProducto");
        long cantidad = Long.parseLong(request.getParameter("cantidad"));
        double totalCosto = Double.parseDouble(request.getParameter("totalCosto"));
        String tipoMoneda = request.getParameter("idTipoMoneda");
        String guia = request.getParameter("idGuia");
        String personalrecibio = request.getParameter("nombrePersonal");
        
        
        //long ruc = Long.parseLong(request.getParameter("ruc"));
        
        
        IngresoProducto ingreso = new IngresoProducto();
        ingreso.setId_producto(producto);
        ingreso.setCantidad(cantidad);
        ingreso.setTotal_costo(totalCosto);
        ingreso.setId_tipo_moneda(tipoMoneda);
        ingreso.setId_guia(guia);
        ingreso.setPersonal_recibio(personalrecibio);
        control.crearIngresoProducto(ingreso);
        
        
        
        List<IngresoProducto> listaIngresoProducto = new ArrayList<IngresoProducto>();
        
        listaIngresoProducto = control.listIngresoProducto();
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaIngresoProducto",listaIngresoProducto);
        response.sendRedirect("Vistas/mostrarIngresoProducto.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
