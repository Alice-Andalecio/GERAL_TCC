package br.cefetmg.inf.geral.model.domain;

public class Medicamento {
    private Long cod_Medicamento;
    private String des_Medicamento;

    public Long getCod_Medicamento() {
        return cod_Medicamento;
    }

    public void setCod_Medicamento(Long cod_Medicamento) {
        this.cod_Medicamento = cod_Medicamento;
    }

    public String getDes_Medicamento() {
        return des_Medicamento;
    }

    public void setDes_Medicamento(String des_Medicamento) {
        this.des_Medicamento = des_Medicamento;
    }
}
