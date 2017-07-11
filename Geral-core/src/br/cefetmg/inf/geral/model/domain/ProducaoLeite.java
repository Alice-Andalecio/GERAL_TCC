package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class ProducaoLeite {
    private Long seq_Animal;
    private Date dat_Producao;
    private Long cod_Grupo;
    private double qtd_Leite_Manha;
    private double qtd_Leite_Tarde;

    public Long getSeq_Animal() {
        return seq_Animal;
    }

    public void setSeq_Animal(Long seq_Animal) {
        this.seq_Animal = seq_Animal;
    }

    public Date getDat_Producao() {
        return dat_Producao;
    }

    public void setDat_Producao(Date dat_Producao) {
        this.dat_Producao = dat_Producao;
    }

    public Long getCod_Grupo() {
        return cod_Grupo;
    }

    public void setCod_Grupo(Long cod_Grupo) {
        this.cod_Grupo = cod_Grupo;
    }

    public double getQtd_Leite_Manha() {
        return qtd_Leite_Manha;
    }

    public void setQtd_Leite_Manha(double qtd_Leite_Manha) {
        this.qtd_Leite_Manha = qtd_Leite_Manha;
    }

    public double getQtd_Leite_Tarde() {
        return qtd_Leite_Tarde;
    }

    public void setQtd_Leite_Tarde(double qtd_Leite_Tarde) {
        this.qtd_Leite_Tarde = qtd_Leite_Tarde;
    }  
}
