/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
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
@WebServlet(name = "SvProveedor", urlPatterns = {"/SvProveedor"})
public class SvProveedor extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Proveedor> lista = new ArrayList<Proveedor>();
        
        lista = control.listProveedor();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProveedor",lista);
        
        response.sendRedirect("Vistas/mostrarProveedor.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long ruc = Long.parseLong(request.getParameter("rucProveedor"));
        String razon = request.getParameter("razonProveedor");
        String direccion = request.getParameter("direccionProveedor");
        String telefono = request.getParameter("telefonoProveedor");
        int estado =1;
        
        Proveedor proveedor = new Proveedor();
        proveedor.setRuc(ruc);
        proveedor.setRazon_social(razon);
        proveedor.setDireccion(direccion);
        proveedor.setTelefono(telefono);
        proveedor.setId_estado(estado);
        control.crearProveedor(proveedor);
        
        
        List<Proveedor> lista = new ArrayList<Proveedor>();
        
        lista = control.listProveedor();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProveedor",lista);
        
        response.sendRedirect("Vistas/mostrarProveedor.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
