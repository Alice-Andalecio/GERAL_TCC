/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aluno
 */
public class CadastroAnimalController {

    static String execute(HttpServletRequest request) {
        String jsp = "";
        
        String opCadastro = request.getParameter("radioCadastro");
        String Sexo = request.getParameter("cadSexo");
        String pertFazenda = request.getParameter("cadPertFaz");
        String tipoRaca = request.getParameter("tipoRaca");
        String racaPuro = request.getParameter("tipoRaca");
        
        //Apenas para raca mestica...
        String porcentMest0 = request.getParameter("porcentagem1");
        String porcentMest1 = request.getParameter("porcentagem2");
        String racaMest1 = request.getParameter("raca1");
        String racaMest2 = request.getParameter("raca2");
        
        
        //Falta pegar os atributos restantes comecando pelos que aparece apos a opcao "Animal".
        
        return jsp;
    }
    
}
