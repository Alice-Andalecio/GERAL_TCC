package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IRepPartoDAO;
import br.cefetmg.inf.geral.model.dao.impl.RepPartoDAO;
import br.cefetmg.inf.geral.model.domain.RepParto;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

public class RepPartoController {

    public static String execute(HttpServletRequest request) throws PersistenciaException, ParseException {
        System.out.println("debug");
        String jsp = "";

        String nomeAnimal = request.getParameter("nomAnimal");
        String numeroAnimal = request.getParameter("numAnimal");

        request.setAttribute("nomAnimal", nomeAnimal);
        request.setAttribute("numAnimal", numeroAnimal);

        String padraoTipo = request.getParameter("padrao");
        String doadoraTipo = request.getParameter("doadora");
        String receptoraTipo = request.getParameter("receptora");
        String descarteTipo = request.getParameter("descarte");

        request.setAttribute("padrao", padraoTipo);
        request.setAttribute("doadora", doadoraTipo);
        request.setAttribute("receptora", receptoraTipo);
        request.setAttribute("descarte", descarteTipo);

        String parto1 = request.getParameter("perParto1");
        String parto2 = request.getParameter("perParto2");
        String gestacao = request.getParameter("diasGest");
        String partoTipo = request.getParameter("tipo");
        String retencaoPlacenta = request.getParameter("retencao");

        request.setAttribute("perParto1", parto1);
        request.setAttribute("perParto2", parto2);
        request.setAttribute("diasGest", gestacao);
        request.setAttribute("tipo", partoTipo);
        request.setAttribute("retencao", retencaoPlacenta);

        String partoData = request.getParameter("dataParto");
        String partoHora = request.getParameter("horaParto");
        String Tipo = request.getParameter("tipoParto");
        String Grau = request.getParameter("grau");

        request.setAttribute("dataParto", partoData);
        request.setAttribute("horaParto", partoHora);
        request.setAttribute("tipoParto", Tipo);
        request.setAttribute("grau", Grau);

        String numeroCrias = request.getParameter("numCrias");

        request.setAttribute("numCrias", numeroCrias);

        String Cria1 = request.getParameter("numCria1");
        String Pelagem1 = request.getParameter("pelagem1");
        String Peso1 = request.getParameter("peso1");
        String Sexo1 = request.getParameter("sexo1");

        String Cria2 = request.getParameter("numCria2");
        String Pelagem2 = request.getParameter("pelagem2");
        String Peso2 = request.getParameter("peso2");
        String Sexo2 = request.getParameter("sexo2");

        request.setAttribute("numCria1", Cria1);
        request.setAttribute("pelagem1", Pelagem1);
        request.setAttribute("peso1", Peso1);
        request.setAttribute("sexo1", Sexo1);

        request.setAttribute("numCria2", Cria2);
        request.setAttribute("pelagem2", Pelagem2);
        request.setAttribute("peso2", Peso2);
        request.setAttribute("sexo2", Sexo2);
        
        java.sql.Date p1 = null;
        java.sql.Date p2 = null;
        java.sql.Date pData = null;
        java.sql.Time pHora = null;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss");
        
        RepParto repparto = new RepParto();
        
        p1 = new java.sql.Date(formato.parse(parto1).getTime());
        repparto.setPerParto1(p1);

        p2 = new java.sql.Date(formato.parse(parto2).getTime());
        repparto.setPerParto2(p2);
        
        pData = new java.sql.Date(formato.parse(partoData).getTime());
        repparto.setDataParto(pData);
        
        pHora = new java.sql.Time(formatoHora.parse(partoHora).getTime());
        repparto.setHoraParto(pHora);

        repparto.setNro_Animal(Long.parseLong(numeroAnimal));
        repparto.setNom_Animal(nomeAnimal);
        
        repparto.setPadrao(padraoTipo);
        repparto.setDoadora(doadoraTipo);
        repparto.setReceptora(receptoraTipo);
        repparto.setDescarte(descarteTipo);

        repparto.setPerParto1(p1);
        repparto.setPerParto2(p2);
        repparto.setDiasGest(Long.parseLong(gestacao));
        repparto.setTipo(partoTipo);
        repparto.setRetencao(Long.parseLong(retencaoPlacenta));

        repparto.setTipoParto(Tipo);
        repparto.setGrau(Grau);

        repparto.setNumCrias(Long.parseLong(numeroCrias));

        repparto.setNumCria1(Cria1);
        repparto.setPelagem1(Pelagem1);
        repparto.setPeso1(Peso1);
        repparto.setSexo1(Sexo1);

        repparto.setNumCria2(Cria2);
        repparto.setPelagem2(Pelagem2);
        repparto.setPeso2(Peso2);
        repparto.setSexo2(Sexo2);
                
        IRepPartoDAO infoRepParto = new RepPartoDAO();
        infoRepParto.inserir(repparto);

        jsp = "/VisualizarExcluirAnimal.jsp";

        return jsp;
    }
}