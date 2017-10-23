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

//------------------------------------------------------------------------------
        //Campos referentes ao campo animal.
        String numeroSisBov = request.getParameter("numSISBOV");
        String brincoEletronico = request.getParameter("brincoEle");
        String numeroRGN = request.getParameter("numRGN");
        String numeroRGD = request.getParameter("numRGD");
        String numeroAnimal = request.getParameter("numAnimal");
        String nomeCompletoAnimal = request.getParameter("nomCompAnimal");
        String nomeResumidoAnimal = request.getParameter("nomAnimal");
        String Peso = request.getParameter("peso");
        String Idade = request.getParameter("idade");
        String Nascimento = request.getParameter("nascimento");
        String Entrada = request.getParameter("entrada");
        String Desmama = request.getParameter("desmama");
        String Aptidao = request.getParameter("aptidao");
        String Pelagem = request.getParameter("pelagem");
        String Categoria = request.getParameter("categoria");

//------------------------------------------------------------------------------
        //campos referentes ao embriao 
        String entradaEmbriao = request.getParameter("entradaEmbriao");
        String numeroEmbriao = request.getParameter("numEmbriao");
        String tipoEmbriao = request.getParameter("tipoEmbriao");
        String classificacaoEmbirao = request.getParameter("classificacaoEmbriao");

//------------------------------------------------------------------------------
        // campos referentes ao semen
        String numSemen = request.getParameter("numSemen");
//------------------------------------------------------------------------------
        // campos referentes ao tipo da raca
        String tipoRaca = request.getParameter("tipoRaca");
        
//------------------------------------------------------------------------------
        // Apenas para raca Pura
        String racaPura = request.getParameter("selectRacaPuro");
        //Apenas para raca mestica...
        String porcentMest0 = request.getParameter("porcentagem1");
        String porcentMest1 = request.getParameter("porcentagem2");
        String racaMest1 = request.getParameter("raca1");
        String racaMest2 = request.getParameter("raca2");
        
        return jsp;
    }

}
