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
@WebServlet(name = "SvEditarCategoriaProducto", urlPatterns = {"/SvEditarCategoriaProducto"})
public class SvEditarCategoriaProducto extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int id_editar = Integer.parseInt(request.getParameter("id_categoriaEdit"));
        
        CategoriaProducto categoria = control.getCategoriaProducto(id_editar);
        
        categoria = control.getCategoriaProducto(id_editar);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("editarCategoria",categoria);
        
        response.sendRedirect("Vistas/editCategoriaProducto.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String descripcion = request.getParameter("descripcionCategoria");
        
        CategoriaProducto categoria = (CategoriaProducto) request.getSession().getAttribute("editarCategoria");
        categoria.setDescripcion(descripcion);
        control.editCategoriaProducto(categoria);
        
        //Para listar 
        List<CategoriaProducto> listaCategoria = new ArrayList<CategoriaProducto>();
        
        listaCategoria = control.listCategoria();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaCategoria",listaCategoria);
        
        //Redirecciona
        response.sendRedirect("Vistas/mostrarCategoriaProducto.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
