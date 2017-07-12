package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class AnimalMedicamento {
    private Long seq_Animal;
    private Long seq_Medicamento;
    private Long cod_Medicamento;
    private Date dat_Inicio;
    private Date dat_Fim;
    private String txt_Prescricao;
    private double qtd_Dosagem;
    private Long qtd_Fequencia;

    public Long getSeq_Animal() {
        return seq_Animal;
    }

    public void setSeq_Animal(Long seq_Animal) {
        this.seq_Animal = seq_Animal;
    }

    public Long getSeq_Medicamento() {
        return seq_Medicamento;
    }

    public void setSeq_Medicamento(Long seq_Medicamento) {
        this.seq_Medicamento = seq_Medicamento;
    }

    public Long getCod_Medicamento() {
        return cod_Medicamento;
    }

    public void setCod_Medicamento(Long cod_Medicamento) {
        this.cod_Medicamento = cod_Medicamento;
    }

    public Date getDat_Inicio() {
        return dat_Inicio;
    }

    public void setDat_Inicio(Date dat_Inicio) {
        this.dat_Inicio = dat_Inicio;
    }

    public Date getDat_Fim() {
        return dat_Fim;
    }

    public void setDat_Fim(Date dat_Fim) {
        this.dat_Fim = dat_Fim;
    }

    public String getTxt_Prescricao() {
        return txt_Prescricao;
    }

    public void setTxt_Prescricao(String txt_Prescricao) {
        this.txt_Prescricao = txt_Prescricao;
    }

    public double getQtd_Dosagem() {
        return qtd_Dosagem;
    }

    public void setQtd_Dosagem(double qtd_Dosagem) {
        this.qtd_Dosagem = qtd_Dosagem;
    }

    public Long getQtd_Fequencia() {
        return qtd_Fequencia;
    }

    public void setQtd_Fequencia(Long qtd_Fequencia) {
        this.qtd_Fequencia = qtd_Fequencia;
    } 
}
