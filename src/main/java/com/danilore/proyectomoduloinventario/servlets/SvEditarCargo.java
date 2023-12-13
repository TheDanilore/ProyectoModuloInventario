/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Cargo;
import com.danilore.proyectomoduloinventario.logica.Controladora;
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
@WebServlet(name = "SvEditarCargo", urlPatterns = {"/SvEditarCargo"})
public class SvEditarCargo extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_editar = Integer.parseInt(request.getParameter("id_cargoEdit"));
        
        Cargo cargo = control.getCargo(id_editar);
        
        cargo = control.getCargo(id_editar);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("editarCargo",cargo);
        
        response.sendRedirect("Vistas/editCargo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String descripcion = request.getParameter("descripcionCargo");
        int estado = 1;
        
        Cargo cargo = (Cargo) request.getSession().getAttribute("editarCargo"); 
        cargo.setDescripcion(descripcion);
        cargo.setId_estado(estado);
        control.editCargo(cargo);
        
        List<Cargo> listaCargo = new ArrayList<Cargo>();
        
        listaCargo = control.listCargo();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaCargo",listaCargo);
        
        response.sendRedirect("Vistas/mostrarCargo.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
