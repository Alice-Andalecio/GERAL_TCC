/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IAnimalDAO;
import br.cefetmg.inf.geral.model.dao.impl.AnimalDAO;
import br.cefetmg.inf.geral.model.domain.Animal;
import java.sql.Date;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aluno
 */
public class CadastroAnimalController {

    static String execute(HttpServletRequest request) throws PersistenciaException, ParseException {
        String jsp = "";

        String opCadastro = request.getParameter("radioCadastro");
        String Sexo = request.getParameter("cadSexo"); // precisa por no bd
        String pertFazenda = request.getParameter("cadPertFaz"); // Pertence a fazenda -- precisa por no bd
//------------------------------------------------------------------------------
        //setAtributte
        request.setAttribute("opCadastro", opCadastro);
        request.setAttribute("cadPertFaz", pertFazenda);
        request.setAttribute("cadSexo", Sexo);

//------------------------------------------------------------------------------
        //Campos referentes ao campo animal.
        String numeroSisBov = request.getParameter("numSISBOV");
        String brincoEletronico = request.getParameter("brincoEle");
        String numeroAnimal = request.getParameter("numAnimal");
        String nomeAnimal = request.getParameter("nomAnimal");
        String Peso = request.getParameter("peso");
        String Idade = request.getParameter("idade");
        String Nascimento = request.getParameter("nascimento");
        String Entrada = request.getParameter("entrada");
        String Desmama = request.getParameter("desmama");
        String Aptidao = request.getParameter("aptidao");
        String Pelagem = request.getParameter("pelagem");
        String Categoria = request.getParameter("categoria");
        String nomePai = request.getParameter("nomPai");
        String nomeMae = request.getParameter("nomMae");
        String numPai = request.getParameter("numPai");
        String numMae = request.getParameter("numMae");
//------------------------------------------------------------------------------
        //setAtributte de animal
        request.setAttribute(numeroSisBov, "numSISBOV");
        request.setAttribute(brincoEletronico, "brincoEle");
        request.setAttribute(numeroAnimal, "numAnimal");
        request.setAttribute(nomeAnimal, "nomAnimal");
        request.setAttribute(Peso, "peso");
        request.setAttribute(Idade, "idade");
        request.setAttribute(Nascimento, "nascimento");
        request.setAttribute(Entrada, "entrada");
        request.setAttribute(Desmama, "desmama");
        request.setAttribute(Aptidao, "aptidao");
        if (!(Pelagem == null && Categoria == null)) {
            request.setAttribute(Pelagem, "pelagem");
            request.setAttribute(Categoria, "categoria");
        }
//------------------------------------------------------------------------------
        //campos referentes ao embriao 
        String entradaEmbriao = request.getParameter("entradaEmbriao");
        String numeroEmbriao = request.getParameter("numEmbriao");
        String tipoEmbriao = request.getParameter("tipoEmbriao");
        String classificacaoEmbriao = request.getParameter("classificacaoEmbriao");
//------------------------------------------------------------------------------
        //setAttribute embriao
        request.setAttribute(entradaEmbriao, "entradaEmbriao");
        request.setAttribute(numeroEmbriao, "numeroEmbriao");

        if (!(tipoEmbriao == null || classificacaoEmbriao == null)) {
            request.setAttribute(tipoEmbriao, "tipoEmbriao");
            request.setAttribute(classificacaoEmbriao, "classificacaoEmbriao");
        }
//------------------------------------------------------------------------------
        // campos referentes ao semen
        String numSemen = request.getParameter("numSemen");
//------------------------------------------------------------------------------
        //setAttribute do semen
        request.setAttribute(numSemen, "numSemen");
//------------------------------------------------------------------------------
        // campos referentes ao tipo da raca
        String tipoRaca = request.getParameter("tipoRaca");
//------------------------------------------------------------------------------
        //setAttribute do tipo da raca
        request.setAttribute(tipoRaca, "tipoRaca");
//------------------------------------------------------------------------------
        // Apenas para raca Pura
        String racaPura = request.getParameter("selectRacaPuro");
//------------------------------------------------------------------------------
        //setAttribute raca pura
        if (!(racaPura.equals(""))) {
            request.setAttribute(racaPura, "selectRacaPuro");
        }
//------------------------------------------------------------------------------
        //Apenas para raca mestica...
        String porcentMest1 = request.getParameter("porcentagem1");
        String porcentMest2 = request.getParameter("porcentagem2");
        String racaMest1 = request.getParameter("raca1");
        String racaMest2 = request.getParameter("raca2");
//------------------------------------------------------------------------------
        //setAtributte para mestica
        request.setAttribute(porcentMest1, "porcentagem1");
        request.setAttribute(porcentMest2, "porcentagem2");
        if (!(racaMest1 == null || racaMest2 == null)) {
            request.setAttribute(racaMest1, "raca1");
            request.setAttribute(racaMest2, "raca2");
        }
//------------------------------------------------------------------------------
        java.sql.Date Nasc = null;
        java.sql.Date Desm = null;
        java.sql.Date Aptd = null;
        java.sql.Date Entr = null;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Animal animal = new Animal();

        if (!(Nascimento.equals("") && Desmama.equals("") && Aptidao.equals("") && Entrada.equals(""))) {
            Nasc = new java.sql.Date(formato.parse(Nascimento).getTime());
            animal.setDat_Nascimento(Nasc);
            Desm = new java.sql.Date(formato.parse(Desmama).getTime());
            animal.setDesmama(Desm);
            Aptd = new java.sql.Date(formato.parse(Aptidao).getTime());
            animal.setAptidao(Aptd);
            Entr = new java.sql.Date(formato.parse(Entrada).getTime());
            animal.setEntrada(Entr);
            animal.setPelagem(Pelagem);
        }

        if (!(numeroAnimal.equals("") && numeroSisBov.equals("") && Peso.equals("")
                && Idade.equals("") && brincoEletronico.equals("") && numPai.equals("") && numMae.equals(""))) {
            animal.setNro_Animal(Long.parseLong(numeroAnimal));
            animal.setNumSisbov(Long.parseLong(numeroSisBov));
            animal.setPeso(Integer.parseInt(Peso));
            animal.setIdade(Integer.parseInt(Idade));
            animal.setBrincoEletronico(Long.parseLong(brincoEletronico));
            animal.setNumPai(Long.parseLong(numPai));
            animal.setNumMae(Long.parseLong(numMae));
        } else {
            animal.setNro_Animal(-1L);
            animal.setNumSisbov(-1L);
            animal.setPeso(-1);
            animal.setIdade(-1);
            animal.setBrincoEletronico(-1L);
            animal.setNumPai(-1L);
            animal.setNumMae(-1L);
        }

        animal.setIdt_Tipo(opCadastro);
        animal.setIdt_Status(Categoria);
        animal.setNomeAnimal(nomeAnimal);
        animal.setRacaPura(racaPura);
        if (!(racaMest1 == null && racaMest2 == null)) {
            animal.setRacaMestica_1(racaMest1);
            animal.setRacaMestica_2(racaMest2);
        } else {
            animal.setRacaMestica_1("");
            animal.setRacaMestica_2("");

        }
        if (!(porcentMest1.equals("") && porcentMest2.equals(""))) {
            animal.setPorcentagem_1(Long.parseLong(porcentMest1));
            animal.setPorcentagem_2(Long.parseLong(porcentMest2));
        } else {
            animal.setPorcentagem_1(-1L);
            animal.setPorcentagem_2(-1L);
        }
        animal.setNomePai(nomePai);
        animal.setNomeMae(nomeMae);
        String email = (String) request.getSession().getAttribute("email");
        animal.setCod_email(email);
        animal.setCod_Grupo(1L);

        IAnimalDAO manterAnimal = new AnimalDAO();
        manterAnimal.inserir(animal);
        jsp = "/VisualizarExcluirAnimal.jsp";

        return jsp;
    }

}
