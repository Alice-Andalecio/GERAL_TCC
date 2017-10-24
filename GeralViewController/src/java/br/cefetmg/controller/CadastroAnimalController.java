/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IAnimalDAO;
import br.cefetmg.inf.geral.model.dao.impl.AnimalDAO;
import br.cefetmg.inf.geral.model.domain.Animal;
import br.cefetmg.inf.util.FormatadorData;
import java.util.Date;
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
        request.setAttribute(Pelagem, "pelagem");
        request.setAttribute(Categoria, "pelagem");

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
        request.setAttribute(tipoEmbriao, "tipoEmbriao");
        request.setAttribute(classificacaoEmbriao, "classificacaoEmbriao");
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
        request.setAttribute(racaPura, "selectRacaPuro");
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
        request.setAttribute(racaMest1, "raca1");
        request.setAttribute(racaMest2, "raca2");
//------------------------------------------------------------------------------
    // completar bd amanha 
       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date Nasc = formato.parse(Nascimento);
        Date Desm = formato.parse(Desmama);
        Date Aptd = formato.parse(Aptidao);
        Date Entr = formato.parse(Entrada);
        
        Animal animal = new Animal();
        animal.setIdt_Tipo(opCadastro);
        animal.setIdt_Status(Categoria);
        animal.setNro_Animal(Long.parseLong(numeroAnimal));
        animal.setNumSisbov(Long.parseLong(numeroSisBov));
        animal.setNomeAnimal(nomeAnimal);
        animal.setPeso(Integer.parseInt(Peso));
        animal.setIdade(Integer.parseInt(Idade));
        animal.setDat_Nascimento(Nasc);
        animal.setDesmama(Desm);
        animal.setAptidao(Aptd);
        animal.setPelagem(Pelagem);
        animal.setEntrada(Entr);
        animal.setBrincoEletronico(Long.parseLong(brincoEletronico));
        animal.setRacaPura(racaPura);
        animal.setRacaMestica_1(racaMest1);
        animal.setRacaMestica_2(racaMest2);
        animal.setPorcentagem_1(Long.parseLong(porcentMest1));
        animal.setPorcentagem_2(Long.parseLong(porcentMest2));
        animal.setNomePai(nomePai);
        animal.setNomeMae(nomeMae);
        
        IAnimalDAO manterAnimal = new AnimalDAO();
        manterAnimal.inserir(animal);
        
        jsp = "/VisualizarExcluirAnimal.jsp";
        
        return jsp;
    }

}
