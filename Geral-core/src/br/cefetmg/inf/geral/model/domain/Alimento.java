package br.cefetmg.inf.geral.model.domain;

public class Alimento {
    private Long cod_alimento;
    private String des_Alimento;

    public Long getCod_alimento() {
        return cod_alimento;
    }

    public void setCod_alimento(Long cod_alimento) {
        this.cod_alimento = cod_alimento;
    }

    public String getDes_Alimento() {
        return des_Alimento;
    }

    public void setDes_Alimento(String des_Alimento) {
        this.des_Alimento = des_Alimento;
    }
}
