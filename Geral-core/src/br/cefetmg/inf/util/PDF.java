/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.inf.util;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Familia
 */
public class PDF implements Documento {

    private Document doc;
    private PdfWriter escritor;

    public PDF() {

    }

    @Override
    public void gerarDocumento() throws IOException, DocumentException {
        doc = new Document();
        escritor = PdfWriter.getInstance(doc, new FileOutputStream("documento.pdf"));
        doc.open();
    }

    @Override
    public void gerarDocumento(String nomeDocumento) throws IOException, DocumentException {
        doc = new Document();
        escritor = PdfWriter.getInstance(doc, new FileOutputStream(nomeDocumento + ".pdf"));
        doc.open();
    }

    @Override
    public void addTituloDocumento(String titulo) throws DocumentException {
        doc.addTitle(titulo);
    }

    @Override
    public void addImagem(Image img, int alinhamento, float largura, float altura) throws DocumentException {
        img.scaleAbsolute(largura, altura);
        img.setAlignment(alinhamento);
        doc.add(img);
    }

    @Override
    public void addGrafico(Image grafico, int alinhamento, float largura, float altura) throws DocumentException {
        grafico.scaleAbsolute(largura, altura);
        grafico.setAlignment(alinhamento);
        doc.add(grafico);
    }

    @Override
    public void addTexto(String texto, FontFamily fonte, int alinhamento, int tamanho, int estilo, BaseColor cor) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph();
        textoParagrafo.setAlignment(alinhamento);
        Font f = new Font(fonte, tamanho, estilo, cor);
        textoParagrafo.setFont(f);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, Font fonte, int alinhamento) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph();
        textoParagrafo.setAlignment(alinhamento);
        textoParagrafo.setFont(fonte);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, Font fonte) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph();
        textoParagrafo.setFont(fonte);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph();
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, int tamanho) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph();
        Font f = new Font(FontFamily.COURIER, tamanho);
        textoParagrafo.setFont(f);
        doc.add(textoParagrafo);
    }

    @Override
    public void addTexto(String texto, int alinhamento, int tamanho) throws DocumentException {
        Paragraph textoParagrafo = new Paragraph();
        Font f = new Font(FontFamily.COURIER, tamanho);
        textoParagrafo.setFont(f);
        textoParagrafo.setAlignment(alinhamento);
        doc.add(textoParagrafo);
    }

    @Override
    public void fecharDocumento() {
        doc.close();
        escritor.close();
    }

    @Override
    public void addTabela(Paragraph[] celula, int nColunas) throws DocumentException {
        PdfPTable tabela = new PdfPTable(nColunas);//Número de colunas
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
        PdfPTable tabela = new PdfPTable(nColunas);//Número de colunas
        for (String txtCelula : celula) {
            tabela.addCell(new Paragraph(txtCelula));
        }
        doc.add(tabela);
    }

    @Override
    public void addGraficoCircular(String tituloGrafico, ArrayList<String> nome, ArrayList<Double> valor,
            int larguraGrafico, int alturaGrafico)
            throws IOException, BadElementException, DocumentException {

        DefaultPieDataset data = new DefaultPieDataset();
        for (int i = 0; i < nome.toArray().length; i++) {
            data.setValue("" + nome.get(i), valor.get(i));
        }
        JFreeChart chart = ChartFactory.createPieChart3D(tituloGrafico,
                data, true, true, true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setLabelLinksVisible(true);
        plot.setNoDataMessage("Não existem dados para serem exibidos no gráfico");
        plot.setStartAngle(90);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        plot.setInteriorGap(0.20);
        Image graf = graficoPNG(chart, tituloGrafico, larguraGrafico, alturaGrafico);
        graf.setAlignment(Element.ALIGN_CENTER);
        doc.add(graf);

    }

    @Override
    public void addGraficoCircular(String tituloGrafico, ArrayList<String> nome, ArrayList<Double> valor) 
            throws IOException, BadElementException, DocumentException {

        DefaultPieDataset data = new DefaultPieDataset();
        for (int i = 0; i < nome.toArray().length; i++) {
            data.setValue(nome.get(i), valor.get(i));
        }
        JFreeChart chart = ChartFactory.createPieChart3D(tituloGrafico,
                data, true, true, true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setLabelLinksVisible(true);
        plot.setNoDataMessage("Não existem dados para serem exibidos no gráfico");
        plot.setStartAngle(90);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        plot.setInteriorGap(0.20);
        Image graf = graficoPNG(chart, tituloGrafico, 300, 300);
        graf.setAlignment(Element.ALIGN_CENTER);
        doc.add(graf);

    }
    private Image graficoPNG(JFreeChart grafico, String tituloGrafico, int largura, int altura) throws IOException, BadElementException{
        OutputStream arquivo = new FileOutputStream(tituloGrafico+".png");
        ChartUtilities.writeChartAsPNG(arquivo, grafico, largura, altura);
        Image png = Image.getInstance(tituloGrafico +".png");
        return png;
    }

    @Override
    public void addGraficoLinha(String tituloGrafico, String nomeLinha, 
            String nomeColuna, ArrayList<String> nome, ArrayList<String> linha, double[][] valor) throws IOException,
            BadElementException, DocumentException{

        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(40.5, "maximo", "dia 1");
        for (int i = 0; i < nome.size(); i++) {
            for (int j = 0; j < linha.size(); j++) {
                ds.addValue(valor[j][i], linha.get(i), nome.get(j));
            }
        }
        JFreeChart grafico = ChartFactory.createLineChart(tituloGrafico, nomeLinha,
                nomeColuna, ds, PlotOrientation.VERTICAL, true, true, false);
        Image png = graficoPNG(grafico, tituloGrafico, 300, 300);
        doc.add(png);
    }
    /*
                 | Dia 1 |  Dia 2   
  linhaAzul      |  54   |   93
  linhaVermelha  |  16   |   18
  linhaVerde     |  99   |   27
    
    m[0][0] = 54
    m[0][1] = 93
    m[1][0] = 16
    m[1][1] = 18
    m[2][0] = 99
    m[2][1] = 27
    
    
    */
}
