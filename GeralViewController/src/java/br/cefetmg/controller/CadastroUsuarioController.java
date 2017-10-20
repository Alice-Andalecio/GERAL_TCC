/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jaops
 */
public class CadastroUsuarioController {

    public static String execute(HttpServletRequest request) {
        System.out.println("debug");
        String jsp = "";
        String nome = request.getParameter("name");
        String email = request.getParameter("email");
        String senha = request.getParameter("password");

        request.setAttribute("name", nome);
        request.setAttribute("email", email);
        request.setAttribute("senha", senha);
/*
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);

        IUsuarioDAO manterUsuario = new UsuarioDAO();
        manterUsuario.inserir(usuario);
*/
        jsp = "/index.jsp";
        return jsp;
    }
}
