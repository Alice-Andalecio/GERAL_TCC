package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.domain.RepDiagnostico;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;


public class RepDiagnosticoController {

    public static String execute(HttpServletRequest request) throws PersistenciaException, ParseException {
        System.out.println("debug");
        String jsp = "";

        String nomeAnimal = request.getParameter("nomAnimal");
        String numeroAnimal = request.getParameter("nomAnimal");

        request.setAttribute("nomAnimal", nomeAnimal);
        request.setAttribute("numAnimal", numeroAnimal);

        String inseminadasCobertasFemea = request.getParameter("inseminadasCobertas");
        String vaziasFemea = request.getParameter("vazias");
        String gestantesFemea = request.getParameter("gestantes");
        String emCrescimentoFemea = request.getParameter("emCrescimento");

        request.setAttribute("inseminadasCobertas", inseminadasCobertasFemea);
        request.setAttribute("vazias", vaziasFemea);
        request.setAttribute("gestantes", gestantesFemea);
        request.setAttribute("emCrescimento", emCrescimentoFemea);

        String padraoTipo = request.getParameter("padrao");
        String doadoraTipo = request.getParameter("doadora");
        String receptoraTipo = request.getParameter("receptora");
        String descarteTipo = request.getParameter("descarte");

        request.setAttribute("padrao", padraoTipo);
        request.setAttribute("doadora", doadoraTipo);
        request.setAttribute("receptora", receptoraTipo);
        request.setAttribute("descarte", descarteTipo);

        String dataDiag = request.getParameter("dataDiagnostico");
        String horaDiag = request.getParameter("horaDiagnostico");

        request.setAttribute("dataDiagnostico", dataDiag);
        request.setAttribute("horaDiagnostico", horaDiag);

        String diag = request.getParameter("diagnostico");
        String sexoFM = request.getParameter("sexo");

        request.setAttribute("diagnostico", diag);
        request.setAttribute("sexo", sexoFM);

        String nroDias = request.getParameter("numDias");
        String rep = request.getParameter("reprodutor");
        String racaAnimal = request.getParameter("raca");

        request.setAttribute("numDias", nroDias);
        request.setAttribute("reprodutor", rep);
        request.setAttribute("raca", racaAnimal);

        String dtCio = request.getParameter("dataCio");
        String hrCio = request.getParameter("horaCio");

        request.setAttribute("dataCio", dtCio);
        request.setAttribute("horaCio", hrCio);
        
        String cioSelect = request.getParameter("cio");
        String mucoSelect = request.getParameter("muco");
        String teSelect = request.getParameter("te");

        request.setAttribute("cio", cioSelect);
        request.setAttribute("muco", mucoSelect);
        request.setAttribute("te", teSelect);
        
        String uteroExame = request.getParameter("utero");
        String ovdExame = request.getParameter("ovD");
        String oveExame = request.getParameter("ovE");
        String baseExame = request.getParameter("base");

        request.setAttribute("utero", uteroExame);
        request.setAttribute("ovD", ovdExame);
        request.setAttribute("ovE", oveExame);
        request.setAttribute("base", baseExame);
        
        String observacao = request.getParameter("obs");

        request.setAttribute("obs", observacao);   
        return null;
    }
}
