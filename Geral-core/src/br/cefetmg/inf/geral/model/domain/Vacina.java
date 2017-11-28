package br.cefetmg.inf.geral.model.domain;

public class Vacina {
    private Long cod_Vacina;
    private String nom_Vacina;
    private int qtd_Doses;

    public Long getCod_Vacina() {
        return cod_Vacina;
    }

    public void setCod_Vacina(Long cod_Vacina) {
        this.cod_Vacina = cod_Vacina;
    }

    public String getNom_Vacina() {
        return nom_Vacina;
    }

    public void setNom_Vacina(String nom_Vacina) {
        this.nom_Vacina = nom_Vacina;
    }

    public int getQtd_Doses() {
        return qtd_Doses;
    }

    public void setQtd_Doses(int qtd_Doses) {
        this.qtd_Doses = qtd_Doses;
    }
}
