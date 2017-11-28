/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.dao.impl.UsuarioDAO;
import br.cefetmg.inf.geral.model.domain.Usuario;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aluno
 */
public class VendaLeiteController {

    static String execute(HttpServletRequest request) throws PersistenciaException {
        String jsp = "";
        IUsuarioDAO usuario = new UsuarioDAO();
        Usuario usu = usuario.consultar((long) request.getSession().getAttribute("codUsuario"));
        String senha = usu.getSenha();
        String email = usu.getEmail();
        Usuario usr = usuario.consultarPorUsuarioSenha(email, senha, true);
        String nome = usr.getNome();
        request.getSession().setAttribute("nome", nome);
        jsp = "/vendaLeite.jsp";
        return jsp;
    }
    
}
