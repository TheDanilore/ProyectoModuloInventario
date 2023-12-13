/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.CategoriaProducto;
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
@WebServlet(name = "SvCategoriaProducto", urlPatterns = {"/SvCategoriaProducto"})
public class SvCategoriaProducto extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<CategoriaProducto> listaCategoria = new ArrayList<CategoriaProducto>();
        
        listaCategoria = control.listCategoria();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaCategoria",listaCategoria);
        
        response.sendRedirect("Vistas/mostrarCategoriaProducto.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String descripcion = request.getParameter("descripcionCategoria");
        
        CategoriaProducto categoria = new CategoriaProducto();
        categoria.setDescripcion(descripcion);
        control.crearCategoriaProducto(categoria);
        
        List<CategoriaProducto> listaCategoria = new ArrayList<CategoriaProducto>();
        
        listaCategoria = control.listCategoria();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaCategoria",listaCategoria);
        
        response.sendRedirect("Vistas/mostrarCategoriaProducto.jsp");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
