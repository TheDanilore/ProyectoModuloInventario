/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.Proveedor;
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
@WebServlet(name = "SvActivarProveedor", urlPatterns = {"/SvActivarProveedor"})
public class SvActivarProveedor extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_baja = request.getParameter("id_proveedor");
        
        Proveedor pro = control.getProveedor(id_baja);
        
        pro = control.getProveedor(id_baja);
        
        int estado =1;
        
        pro.setId_estado(estado);
        control.editProveedor(pro);
        
        
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
