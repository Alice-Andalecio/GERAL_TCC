package br.cefetmg.inf.geral.model.domain;

public class GrupoAlimentoDieta {
    private Long cod_Grupo;
    private Long cod_Alimento;
    private Double per_Composicao;

    public Long getCod_Grupo() {
        return cod_Grupo;
    }

    public void setCod_Grupo(Long cod_Grupo) {
        this.cod_Grupo = cod_Grupo;
    }

    public Long getCod_Alimento() {
        return cod_Alimento;
    }

    public void setCod_Alimento(Long cod_Alimento) {
        this.cod_Alimento = cod_Alimento;
    }

    public Double getPer_Composicao() {
        return per_Composicao;
    }

    public void setPer_Composicao(Double per_Composicao) {
        this.per_Composicao = per_Composicao;
    }
}
