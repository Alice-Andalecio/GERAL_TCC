package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class ControleProducao {
    private Long seq_Compra;
    private Long seq_Animal;
    private Date dat_producao;

    public Long getSeq_Compra() {
        return seq_Compra;
    }

    public void setSeq_Compra(Long seq_Compra) {
        this.seq_Compra = seq_Compra;
    }

    public Long getSeq_Animal() {
        return seq_Animal;
    }

    public void setSeq_Animal(Long seq_Animal) {
        this.seq_Animal = seq_Animal;
    }

    public Date getDat_producao() {
        return dat_producao;
    }

    public void setDat_producao(Date dat_producao) {
        this.dat_producao = dat_producao;
    }
}
