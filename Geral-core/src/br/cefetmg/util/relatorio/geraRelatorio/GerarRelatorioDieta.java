package br.cefetmg.util.relatorio.geraRelatorio;

import br.cefetmg.util.relatorio.Imprimir.Imprimir;
import br.cefetmg.util.relatorio.config.PDF;
import br.cefetmg.util.relatorio.config.Relatorio;
import com.itextpdf.text.DocumentException;
import java.io.IOException;

public class GerarRelatorioDieta implements Relatorio {

    private PDF relatorio;

    @Override
    public void gerarRelatorio() throws IOException, DocumentException {
        relatorio = new PDF();
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
