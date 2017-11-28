package br.cefetmg.inf.geral.model.domain;

public class Comprador {
    private Long cod_CNPJ;
    private String nom_Comprador;

    public Long getCod_CNPJ() {
        return cod_CNPJ;
    }

    public void setCod_CNPJ(Long cod_CNPJ) {
        this.cod_CNPJ = cod_CNPJ;
    }

    public String getNom_Comprador() {
        return nom_Comprador;
    }

    public void setNom_Comprador(String nom_Comprador) {
        this.nom_Comprador = nom_Comprador;
    }
}
