package br.cefetmg.util.relatorio.config;

import br.cefetmg.util.relatorio.config.PDF;
import com.itextpdf.text.DocumentException;
import java.io.IOException;

public interface Relatorio {
    public void gerarRelatorio() throws IOException, DocumentException;
    public PDF getRelatorio();
    public void imprimirRelatorio();
}
