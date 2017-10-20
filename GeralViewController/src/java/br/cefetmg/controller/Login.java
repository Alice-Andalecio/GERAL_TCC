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
class Login {
    public static String execute (HttpServletRequest request){
        String jsp = "";
        try {
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String tipoUsurio = request.getParameter("tipoUsuario");
            if(email.isEmpty()&&senha.isEmpty()){
               jsp = "/erro.jsp";
            } else {
              if(tipoUsurio.equals("1"))
                jsp = "/perfilAdm.jsp";
              else 
                  jsp = "/perfil.jsp";
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return jsp;
    }
}
