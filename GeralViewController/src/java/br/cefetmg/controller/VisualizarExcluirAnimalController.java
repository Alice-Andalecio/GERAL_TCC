/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

/**
 *
 * @author jaops
 */
import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.dao.impl.UsuarioDAO;
import br.cefetmg.inf.geral.model.domain.Usuario;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class VisualizarExcluirAnimalController {

    public static String execute(HttpServletRequest request) throws PersistenciaException {
        String jsp = "";
        IUsuarioDAO usuario = new UsuarioDAO();
        Usuario usu = usuario.consultar((long) request.getSession().getAttribute("codUsuario"));
        String email = usu.getEmail();
        String senha = usu.getSenha();
        Usuario usr = usuario.consultarPorUsuarioSenha(email, senha, true);
        String nome = usr.getNome();
        String email_ = usr.getEmail();
//       String email = request.getParameter("email");
//       String senha = request.getParameter("password");

        request.setAttribute("nome", nome);
        HttpSession session = request.getSession();
        request.getSession().setAttribute("email", email_);
        request.getSession().setAttribute("codUsuario", usr.getIdUsuario());
        jsp = "/CadastroAnimal.jsp";

        return jsp;
    }
}
