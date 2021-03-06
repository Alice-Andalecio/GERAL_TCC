/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package br.cefetmg.util.relatorio.config;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.style.Styler.LegendPosition;

/**

 @author Familia
 */
public class PDF implements Documento {

    private Document doc;
    private FileOutputStream documento;
    private File arquivo;
    private int larguraGrafico = 520;
    private int alturaGrafico = 450;

    public PDF() {

    }

    @Override
    public void gerarDocumento() throws IOException, DocumentException {
        doc = new Document();
        arquivo = new File("Relatorio.pdf");
        documento = new FileOutputStream(arquivo);
        PdfWriter.getInstance(doc, documento);
        doc.open();

    }

    @Override
    public void gerarDocumento(String nomeDocumento) throws IOException, DocumentException {
        doc = new Document();
        arquivo = new File(System.getProperty("user.home")+"/Desktop/"+nomeDocumento + ".pdf");
        arquivo.createNewFile();
        documento = new FileOutputStream(arquivo);
        PdfWriter.getInstance(doc, documento);
        doc.open();
    }

    @Override
    public void addTituloDocumento(String titulo) throws DocumentException {
        doc.addTitle(titulo);
    }

    public void addTitulo(String texto, Font f, int alinhamento) throws DocumentException {
        Paragraph titulo = new Paragraph(texto, f);
        titulo.setAlignment(alinhamento);
        titulo.setSpacingAfter(50f);
        doc.add(titulo);
    }

    @Override
    public void addImagem(Image img, int alinhamento, float largura, float altura) throws DocumentException {
        img.scaleAbsolute(largura, altura);
        img.setAlignment(alinhamento);
        doc.add(img);
    }

    @Override
    public void addTexto(String texto, FontFamily fonte, int alinhamento, int tamanho, int estilo, BaseColor cor) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph(texto, FontFactory.getFont(fonte.name(), tamanho, estilo, cor));
        textoParagrafo.setAlignment(alinhamento);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, Font fonte, int alinhamento) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph(texto, fonte);
        textoParagrafo.setAlignment(alinhamento);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, Font fonte) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph(texto, fonte);
        textoParagrafo.setSpacingBefore(-50f);
        textoParagrafo.setSpacingAfter(50f);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph(texto);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, int tamanho) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph(texto, FontFactory.getFont(Template.FONTE_PADRAO, tamanho));
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, int alinhamento, int tamanho) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph(texto, FontFactory.getFont(Template.FONTE_PADRAO, tamanho));
        textoParagrafo.setAlignment(alinhamento);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTabela(Paragraph[] celula, int nColunas) throws DocumentException {
        PdfPTable tabela = new PdfPTable(nColunas);
        for (Paragraph paragrafoCelula : celula) {
            tabela.addCell(paragrafoCelula);
        }
        if (tabela.getLastCompletedRowIndex() != tabela.getRows().size()) {
            tabela.completeRow();
        }
        tabela.setTotalWidth(100f);
        tabela.setLockedWidth(true);
        doc.add(tabela);
    }

    @Override
    public void addTabela(String[] celula, int nColunas) throws DocumentException {
        PdfPTable tabela = new PdfPTable(nColunas);
        int i = 0;
        for (String txtCelula : celula) {
            Paragraph pr = null;
            if (i < nColunas) {
                pr = new Paragraph(txtCelula, FontFactory.getFont(FontFactory.TIMES_BOLD));
            } else {
                pr = new Paragraph(txtCelula, Template.TEXTO_SIMPLES);
            }
            i++;
            PdfPCell celulaPDF = new PdfPCell(pr);
            celulaPDF.setBorder(0);
            tabela.setLockedWidth(true);
            tabela.setTotalWidth(550f);
            celulaPDF.setMinimumHeight(25f);
            celulaPDF.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(celulaPDF);

        }
        for (int j = tabela.getRows().size(); j > tabela.getLastCompletedRowIndex(); j--) {
            PdfPCell vazia = new PdfPCell(new Paragraph(""));
            vazia.setBorder(0);
            tabela.addCell(vazia);
        }

        doc.add(tabela);
    }

    public void addTabelaAnimal(String[] celula, int nColunas) throws DocumentException {
        PdfPTable tabela = new PdfPTable(nColunas);
        int i = 0;
        for (String txtCelula : celula) {
            i++;
            Paragraph pr = new Paragraph(txtCelula, Template.TEXTO_SIMPLES);
            PdfPCell celulaPDF = new PdfPCell(pr);
            celulaPDF.setBorder(0);
            if (i % 2 == 0) {
                celulaPDF.setColspan(2);
            }
            tabela.setLockedWidth(true);
            tabela.setTotalWidth(550f);
            if (txtCelula.contains("Nº") && !txtCelula.contains("Nº SISBOV")) {
                celulaPDF.setColspan(3);
            }
            celulaPDF.setMinimumHeight(25f);
            tabela.addCell(celulaPDF);
        }

        for (int j = tabela.getRows().size(); j > tabela.getLastCompletedRowIndex(); j--) {
            PdfPCell vazia = new PdfPCell(new Paragraph(""));
            vazia.setBorder(0);
            tabela.addCell(vazia);
        }

        doc.add(tabela);
    }

    @Override
    public void addTabela(Object tabela) throws DocumentException {
        if (tabela instanceof PdfPTable) {
            doc.add((PdfPTable) tabela);
        } else {
            throw new ClassCastException("Não é uma tabela para pdf itext!");
        }
    }

    @Override
    public void addGraficoCircular(String tituloGrafico, ArrayList<String> nome, ArrayList<Double> valor,
            int larguraGrafico, int alturaGrafico)
            throws IOException, BadElementException, DocumentException {

        PieChart chart = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();
        Color[] cores = new Color[nome.size()];
        for (int i = 0; i < nome.size(); i++) {
            cores[i] = br.cefetmg.util.relatorio.DadosTestes.Cores.getCores().get(i);
        }
        chart.getStyler().setSeriesColors(cores);
        for (int i = 0; i < nome.size(); i++) {
            chart.addSeries(nome.get(i), valor.get(i));
        }
        chart.getStyler().setChartBackgroundColor(null);
        chart.getStyler().setPlotBorderColor(null);
        BitmapEncoder.saveBitmap(chart, "./" + tituloGrafico, BitmapFormat.PNG);
        addGraficoCircular(tituloGrafico);
    }

    private void addGraficoCircular(String tituloGrafico)
            throws IOException, BadElementException, DocumentException {

        Image graf = graficoPNG(tituloGrafico, 500, 400);
        graf.setAlignment(Element.ALIGN_CENTER);
        doc.add(graf);
        File f = new File(tituloGrafico + ".png");
        if (f.exists()) {
            f.delete();
        }

    }

    private Image graficoPNG(String tituloGrafico, int largura, int altura) throws IOException, BadElementException {
        Image png = Image.getInstance(tituloGrafico + ".png");
        png.scaleAbsolute(largura, altura);
        return png;
    }

    /*
     tituloGrafico: O texto que fica acima do grafico nomeLinha: A legenda para
     o eixo X nomeColuna: A legenda para o eixo Y nome: Posições no eixo X (Ex:
     Anos dias) linha: O nome das linhas que o grafico contem valor: Cada linha
     da matriz eh uma linha do grafico e cada Coluna eh um valor Ex: valor[0][0]
     é o valor Da linha 1 no primeiro ano;
     */
    @Override
    public void addGraficoLinha(String tituloGrafico, String nomeLinha,
            String nomeColuna, ArrayList<String> nome, ArrayList<String> linha, double[][] valor) throws IOException,
            BadElementException, DocumentException {
    }

    public void addGraficoBarra(String tituloGrafico, String legendaEixoX, String legendaEixoY, List<String> nomes,
            List<Double> valores, String significadoBarra) throws IOException, BadElementException, DocumentException {
        CategoryChart chart = new CategoryChartBuilder().width(larguraGrafico).height(alturaGrafico).title(tituloGrafico).xAxisTitle(legendaEixoX).yAxisTitle(legendaEixoY).build();
        chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setChartBackgroundColor(null);
        chart.getStyler().setPlotGridLinesVisible(false);
        Color[] c = new Color[1];
        c[0] = Color.decode("#37943a");
        chart.getStyler().setSeriesColors(c);
        chart.addSeries(significadoBarra, nomes, valores);
        BitmapEncoder.saveBitmap(chart, "./" + tituloGrafico, BitmapFormat.PNG);
        Image grafico = graficoPNG(tituloGrafico, larguraGrafico, alturaGrafico);
        grafico.setAlignment(Element.ALIGN_CENTER);
        doc.add(grafico);
        File f = new File(tituloGrafico + ".png");
        if (f.exists()) {
            f.delete();
        }
    }

    @Override
    public void fecharDocumento() {
        doc.close();
    }

    @Override
    public File getArquivo() {
        return arquivo;
    }
}
