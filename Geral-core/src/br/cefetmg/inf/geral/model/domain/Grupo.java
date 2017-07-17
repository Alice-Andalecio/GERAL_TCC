package br.cefetmg.inf.geral.model.domain;

public class Grupo {
    private Long cod_Grupo;
    private String nom_Grupo;
    private Double qtd_Media_Producao;

    public Long getCod_Grupo() {
        return cod_Grupo;
    }

    public void setCod_Grupo(Long cod_Grupo) {
        this.cod_Grupo = cod_Grupo;
    }

    public String getNom_Grupo() {
        return nom_Grupo;
    }

    public void setNom_Grupo(String nom_Grupo) {
        this.nom_Grupo = nom_Grupo;
    }

    public Double getQtd_Media_Producao() {
        return qtd_Media_Producao;
    }

    public void setQtd_Media_Producao(Double qtd_Media_Producao) {
        this.qtd_Media_Producao = qtd_Media_Producao;
    }  
}