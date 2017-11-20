/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.dao.impl.UsuarioDAO;
import br.cefetmg.inf.geral.model.domain.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jaops
 */
public class Login {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            String email = request.getParameter("email");
            String senha = request.getParameter("password");

            IUsuarioDAO usuario = new UsuarioDAO();
            Usuario usr = usuario.consultarPorUsuarioSenha(email, senha,false);
            if(usr == null){
                return "/login.jsp";
            }
            String nome = usr.getNome();
            
            if (email.isEmpty() || senha.isEmpty()) {
                jsp = "/erro.jsp";
            } else {
                request.setAttribute("email", email);
                request.setAttribute("password", senha);
                request.setAttribute("nome", nome);

                HttpSession session = request.getSession();
                request.getSession().setAttribute("nome",nome);
                request.getSession().setAttribute("codUsuario", usr.getIdUsuario());
                jsp = "/VisualizarExcluirAnimal.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsp;
    }

    public static void validarSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long codUsuario = (Long) request.getSession().getAttribute("codUsuario");
        String jsp = "";
        if (codUsuario == null) {
            jsp = "/index.jsp";
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }
    }

}
