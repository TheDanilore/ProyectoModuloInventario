/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Cargo;
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
@WebServlet(name = "SvEditarUsuario", urlPatterns = {"/SvEditarUsuario"})
public class SvEditarUsuario extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_editar = Integer.parseInt(request.getParameter("id_usuarioEdit"));

        Usuario usu = control.getUsuario(id_editar);

        usu = control.getUsuario(id_editar);

        HttpSession misesion = request.getSession();
        misesion.setAttribute("editarUsuario", usu);

        response.sendRedirect("Vistas/editUsuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("correoUsuario");
        String contra = request.getParameter("contraUsuario");
        int cargo = Integer.parseInt(request.getParameter("idCargo"));
        int estado = 1;

        //Consiguiendo objeto tipoMoneda por el id
        Cargo car = control.getCargo(cargo);

        car = control.getCargo(cargo);

        if (car != null) {
            Usuario usu = (Usuario) request.getSession().getAttribute("editarUsuario");
            usu.setCorreo_usuario(correo);
            usu.setContra_usuario(contra);
            usu.setId_cargo(cargo);
            usu.setId_estado(estado);
            control.editUsuario(usu);

            List<Usuario> listaUsuarios = new ArrayList<Usuario>();

            listaUsuarios = control.listUsuario();

            HttpSession misesion = request.getSession();
            misesion.setAttribute("listaUsuarios", listaUsuarios);
            response.sendRedirect("Vistas/mostrarUsuarios.jsp");
        } else {
            response.sendRedirect("Vistas/addUsuarios.jsp?error=cargoNoExiste");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
