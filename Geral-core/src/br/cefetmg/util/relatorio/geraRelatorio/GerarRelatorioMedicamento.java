package br.cefetmg.util.relatorio.geraRelatorio;

import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.geral.model.service.impl.ManterMedicamento;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import br.cefetmg.util.relatorio.Imprimir.Imprimir;
import br.cefetmg.util.relatorio.config.PDF;
import br.cefetmg.util.relatorio.config.Relatorio;
import br.cefetmg.util.relatorio.config.Template;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerarRelatorioMedicamento implements Relatorio {

    private PDF relatorio;

    @Override
    public void gerarRelatorio() throws IOException, DocumentException {
        relatorio = new PDF();
        relatorio.gerarDocumento("RELATORIO MEDICAMENTO");
        relatorio.addTitulo("RELATORIO MEDICAMENTO", Template.TITULO_PRINCIPAL
                , Template.ALINHAMENTO_TITULO_PRINCIPAL);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-");
        try {
            ManterMedicamento persisteMedicamento = new ManterMedicamento();

            ArrayList<Medicamento> medicamento;
            medicamento = new ArrayList(persisteMedicamento.pesquisarTodos());
            String[] celula = new String[medicamento.size() * 3];
            System.out.println("med: "+medicamento.size());
            int j = 0;
            for (int i = 0; i < celula.length; i += 3) {
                celula[i] = medicamento.get(j).getCod_Medicamento()+"";
                celula[i+1] = medicamento.get(j).getNomeMedicamento()+"";
                celula[i+2] = medicamento.get(j).getDes_Medicamento()+"";
                j++;
                System.out.println("=========================------------------------");
                System.out.println(celula[i]);
                System.out.println(celula[i+1]);
                System.out.println(celula[i+2]);
            }
            relatorio.addTabela(celula, 3);
            relatorio.fecharDocumento();
            
        } catch (PersistenciaException ex) {
            Logger.getLogger(GerarRelatorioMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PDF getRelatorio() {
        return relatorio;
    }

    @Override
    public void imprimirRelatorio() {
        Imprimir.imprimir(relatorio);
    }

}
