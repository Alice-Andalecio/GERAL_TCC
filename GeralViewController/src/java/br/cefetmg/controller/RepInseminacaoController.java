package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IRepInseminacaoDAO;
import br.cefetmg.inf.geral.model.dao.impl.RepInseminacaoDAO;
import br.cefetmg.inf.geral.model.domain.RepInseminacao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

public class RepInseminacaoController {
    public static String execute(HttpServletRequest request) throws PersistenciaException, ParseException {
        System.out.println("debug");
        String jsp = "";
        
        String nomeAnimal = request.getParameter("nomAnimal");
        String numeroAnimal = request.getParameter("numAnimal");

        request.setAttribute("nomAnimal", nomeAnimal);
        request.setAttribute("numAnimal", numeroAnimal);
        
        String insCob = request.getParameter("inseminadasCobertas");
        String vazia = request.getParameter("vazias");
        String gest = request.getParameter("gestantes");
        
        request.setAttribute("inseminadasCobertas", insCob);
        request.setAttribute("vazias", vazia);
        request.setAttribute("gestantes", gest);
        
        String insemin = request.getParameter("inseminacao");
        String cobri = request.getParameter("cobricao");
        
        request.setAttribute("inseminacao", insemin);
        request.setAttribute("cobricao", cobri);
        
        String somaSetor = request.getParameter("somSetor");
        String tds = request.getParameter("todos");
        
        request.setAttribute("somSetor", somaSetor);
        request.setAttribute("todos", tds);
        
        String padraoTipo = request.getParameter("padrao");
        String doadoraTipo = request.getParameter("doadora");
        String receptoraTipo = request.getParameter("receptora");
        String descarteTipo = request.getParameter("descarte");

        request.setAttribute("padrao", padraoTipo);
        request.setAttribute("doadora", doadoraTipo);
        request.setAttribute("receptora", receptoraTipo);
        request.setAttribute("descarte", descarteTipo);
        
        String dtInseminacao = request.getParameter("dataInseminacao");
        String hrInseminacao = request.getParameter("horaInseminacao");
        
        request.setAttribute("dataInseminacao", dtInseminacao);
        request.setAttribute("horaInseminacao", hrInseminacao);
        
        String rep = request.getParameter("reprodutor");
        String racas = request.getParameter("raca");
        String insem = request.getParameter("inseminador");
        String numeroDoses = request.getParameter("numDoses");

        request.setAttribute("reprodutor", rep);
        request.setAttribute("raca", racas);
        request.setAttribute("inseminador", insem);
        request.setAttribute("numDoses", numeroDoses);
        
        String dtCio = request.getParameter("dataCio");
        String hrCio = request.getParameter("horaCio");
        
        request.setAttribute("dataCio", dtCio);
        request.setAttribute("horaCio", hrCio);
        
        String vacaCio = request.getParameter("cio");
        String vacaMuco = request.getParameter("muco");
        String vacaTe = request.getParameter("te");
        String vacaEcc = request.getParameter("ecc");
        String iatf = request.getParameter("proIATF");

        request.setAttribute("cio", vacaCio);
        request.setAttribute("muco", vacaMuco);
        request.setAttribute("vacaTe", vacaTe);
        request.setAttribute("vacaEcc", vacaEcc);
        request.setAttribute("proIATF", iatf);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss");
        
        Date dataIns = formato.parse(dtInseminacao);
        Date hInseminacao = formatoHora.parse(hrInseminacao);
        Date dCio = formato.parse(dtCio);
        Date hCio = formatoHora.parse(hrCio);
        
        RepInseminacao repinseminacao = new RepInseminacao();
        
        repinseminacao.setNumAnimal(Long.parseLong(numeroAnimal));
        repinseminacao.setNomAnimal(nomeAnimal);
        
        repinseminacao.setInseminadasCobertas(insCob);
        repinseminacao.setVazias(vazia);
        repinseminacao.setGestantes(gest);
        
        repinseminacao.setInseminacao(insemin);
        repinseminacao.setCobricao(cobri);
        
        repinseminacao.setSomSetor(somaSetor);
        repinseminacao.setTodos(tds);
        
        repinseminacao.setPadrao(padraoTipo);
        repinseminacao.setDoadora(doadoraTipo);
        repinseminacao.setReceptora(receptoraTipo);
        repinseminacao.setDescarte(descarteTipo);
        
        repinseminacao.setDataInseminacao((java.sql.Date) dataIns);
        repinseminacao.setHoraInseminacao((Time) hInseminacao);
        
        repinseminacao.setReprodutor(rep);
        repinseminacao.setRaca(racas);
        repinseminacao.setInseminador(insem);
        repinseminacao.setNumDoses(numeroDoses);
        
        repinseminacao.setDataCio((java.sql.Date) dCio);
        repinseminacao.setHoraCio((Time) hCio);
        
        repinseminacao.setCio(Long.parseLong(vacaCio));
        repinseminacao.setMuco(Long.parseLong(vacaMuco));
        repinseminacao.setTe(Long.parseLong(vacaTe));
        repinseminacao.setEcc(vacaEcc);
        repinseminacao.setProIATF(iatf);
        
        IRepInseminacaoDAO infoRepInseminacao = new RepInseminacaoDAO();
        infoRepInseminacao.inserir(repinseminacao);
        
        jsp = "/VisualizarExcluirAnimal.jsp";
        
        return jsp;
    }
}
