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
@WebServlet(name = "SvActivarCargo", urlPatterns = {"/SvActivarCargo"})
public class SvActivarCargo extends HttpServlet {

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
        int id_baja = Integer.parseInt(request.getParameter("id_cargo"));
        
        Cargo cargo = control.getCargo(id_baja);
        
        cargo = control.getCargo(id_baja);
        
        int estado =1;
        
        cargo.setId_estado(estado);
        control.editCargo(cargo);
        
        
        List<Cargo> lista = new ArrayList<Cargo>();
        
        lista = control.listCargo();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaCargo",lista);
        response.sendRedirect("Vistas/mostrarCargo.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
