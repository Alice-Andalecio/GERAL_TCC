package br.cefetmg.util.relatorio.geraRelatorio;

import br.cefetmg.util.relatorio.DadosTestes.DadosTesteControleLeiteiro;
import br.cefetmg.util.relatorio.config.PDF;
import br.cefetmg.util.relatorio.Imprimir.Imprimir;
import br.cefetmg.util.relatorio.config.Relatorio;
import br.cefetmg.util.relatorio.config.Template;
import com.itextpdf.text.DocumentException;
import java.io.IOException;

public class GerarRelatorioControleLeiteiro implements Relatorio {

    private PDF relatorio;

    @Override
    public void gerarRelatorio() throws IOException, DocumentException {
        relatorio = new PDF();
        relatorio.gerarDocumento("Controle_Leiteiro");
        relatorio.addTitulo("Controle Leiteiro", Template.TITULO_PRINCIPAL, Template.ALINHAMENTO_TITULO_PRINCIPAL);
        relatorio.addTabela(DadosTesteControleLeiteiro.tabela(), Template.NUMERO_COLUNAS_TABELA);
        relatorio.addGraficoBarra("Relatorio Produção de Leite", "ANO(S)",
                "LEITE(L)", DadosTesteControleLeiteiro.anoTabelaArrayList(),
                DadosTesteControleLeiteiro.producaoAnualTabelaArrayList(), "LEITE");
        relatorio.fecharDocumento();
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
