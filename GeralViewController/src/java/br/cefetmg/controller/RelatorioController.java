package br.cefetmg.controller;

import br.cefetmg.inf.util.db.exception.PersistenciaException;
import br.cefetmg.util.relatorio.config.Relatorio;
import br.cefetmg.util.relatorio.geraRelatorio.GerarRelatorioAnimal;
import br.cefetmg.util.relatorio.geraRelatorio.GerarRelatorioControleLeiteiro;
import br.cefetmg.util.relatorio.geraRelatorio.GerarRelatorioDieta;
import br.cefetmg.util.relatorio.geraRelatorio.GerarRelatorioMedicamento;
import br.cefetmg.util.relatorio.geraRelatorio.GerarRelatorioVendaLeite;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

public class RelatorioController {

    public static String execute(HttpServletRequest request) throws PersistenciaException, ParseException {
        String jsp;
        String codigo = request.getParameter(("cod"));
        Relatorio relatorio;
        try{
        if (codigo.contains("1")) {//CONTROLE LEITEIRO
            relatorio = new GerarRelatorioControleLeiteiro();
            relatorio.gerarRelatorio();
        }
        if (codigo.contains("2")) {//RESUMO DO ANIMAL
            relatorio = new GerarRelatorioAnimal();
            relatorio.gerarRelatorio();
        }
        if (codigo.contains("3")) {//VENDA DE LEITE
            relatorio = new GerarRelatorioVendaLeite();
            relatorio.gerarRelatorio();
        }
        if (codigo.contains("4")) {//MEDICAMENTOS
            relatorio = new GerarRelatorioMedicamento();
            relatorio.gerarRelatorio();
        }
        if (codigo.contains("5")) {//DIETA
            relatorio = new GerarRelatorioDieta();
            relatorio.gerarRelatorio();
        }
        }catch(IOException ex){
            System.out.println("ERRO : "+ex.getMessage());
        } catch (DocumentException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("RelMedicamento", "checkbox");
        jsp = "/VisualizarExcluirAnimal.jsp";
        return jsp;
    }
}
