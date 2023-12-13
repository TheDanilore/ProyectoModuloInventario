
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.Usuario;
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
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    Controladora control = new Controladora();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = control.listUsuario();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        
        response.sendRedirect("Vistas/mostrarUsuarios.jsp");
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("correoUsuario");
        String contra = request.getParameter("contraUsuario");
        int cargo = Integer.parseInt(request.getParameter("idCargo"));
        int estado =1;
        
  
        control.crearUsuario(correo,contra,cargo,estado);
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = control.listUsuario();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        response.sendRedirect("Vistas/mostrarUsuarios.jsp");
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
