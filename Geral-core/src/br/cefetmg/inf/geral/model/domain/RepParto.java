package br.cefetmg.inf.geral.model.domain;

import java.sql.Time;
import java.util.Date;

public class RepParto {
    private Long seq_ReproducaoParto;
    private Long nro_Animal;
    private String nom_Animal;
    private String padrao;
    private String doadora;
    private String receptora;
    private String descarte;
    private Date perParto1;
    private Date perParto2;
    private Long diasGest;
    private String tipo;
    private Long retencao;
    private Date dataParto;
    private Time horaParto;
    private String tipoParto;
    private String grau;
    private Long numCrias;
    private String numCria1;
    private String pelagem1;
    private String peso1;
    private String sexo1;
    private String numCria2;
    private String pelagem2;
    private String peso2;
    private String sexo2;

    public Long getSeq_ReproducaoParto() {
        return seq_ReproducaoParto;
    }

    public void setSeq_ReproducaoParto(Long seq_ReproducaoParto) {
        this.seq_ReproducaoParto = seq_ReproducaoParto;
    }

    public Long getNro_Animal() {
        return nro_Animal;
    }

    public void setNro_Animal(Long nro_Animal) {
        this.nro_Animal = nro_Animal;
    }

    public String getNom_Animal() {
        return nom_Animal;
    }

    public void setNom_Animal(String nom_Animal) {
        this.nom_Animal = nom_Animal;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public String getDoadora() {
        return doadora;
    }

    public void setDoadora(String doadora) {
        this.doadora = doadora;
    }

    public String getReceptora() {
        return receptora;
    }

    public void setReceptora(String receptora) {
        this.receptora = receptora;
    }

    public String getDescarte() {
        return descarte;
    }

    public void setDescarte(String descarte) {
        this.descarte = descarte;
    }

    public Date getPerParto1() {
        return perParto1;
    }

    public void setPerParto1(Date perParto1) {
        this.perParto1 = perParto1;
    }

    public Date getPerParto2() {
        return perParto2;
    }

    public void setPerParto2(Date perParto2) {
        this.perParto2 = perParto2;
    }

    public Long getDiasGest() {
        return diasGest;
    }

    public void setDiasGest(Long diasGest) {
        this.diasGest = diasGest;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getRetencao() {
        return retencao;
    }

    public void setRetencao(Long retencao) {
        this.retencao = retencao;
    }

    public Date getDataParto() {
        return dataParto;
    }

    public void setDataParto(Date dataParto) {
        this.dataParto = dataParto;
    }

    public Time getHoraParto() {
        return horaParto;
    }

    public void setHoraParto(Time horaParto) {
        this.horaParto = horaParto;
    }

    public String getTipoParto() {
        return tipoParto;
    }

    public void setTipoParto(String tipoParto) {
        this.tipoParto = tipoParto;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public Long getNumCrias() {
        return numCrias;
    }

    public void setNumCrias(Long numCrias) {
        this.numCrias = numCrias;
    }

    public String getNumCria1() {
        return numCria1;
    }

    public void setNumCria1(String numCria1) {
        this.numCria1 = numCria1;
    }

    public String getPelagem1() {
        return pelagem1;
    }

    public void setPelagem1(String pelagem1) {
        this.pelagem1 = pelagem1;
    }

    public String getPeso1() {
        return peso1;
    }

    public void setPeso1(String peso1) {
        this.peso1 = peso1;
    }

    public String getSexo1() {
        return sexo1;
    }

    public void setSexo1(String sexo1) {
        this.sexo1 = sexo1;
    }

    public String getNumCria2() {
        return numCria2;
    }

    public void setNumCria2(String numCria2) {
        this.numCria2 = numCria2;
    }

    public String getPelagem2() {
        return pelagem2;
    }

    public void setPelagem2(String pelagem2) {
        this.pelagem2 = pelagem2;
    }

    public String getPeso2() {
        return peso2;
    }

    public void setPeso2(String peso2) {
        this.peso2 = peso2;
    }

    public String getSexo2() {
        return sexo2;
    }

    public void setSexo2(String sexo2) {
        this.sexo2 = sexo2;
    }
}