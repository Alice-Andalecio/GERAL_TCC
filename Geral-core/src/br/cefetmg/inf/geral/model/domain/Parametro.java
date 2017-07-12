package br.cefetmg.inf.geral.model.domain;

public class Parametro {
    private String cod_Parametro;
    private Long qtd_Dia_Secagem;
    private Long qtd_Dia_Amamentacao;

    public String getCod_Parametro() {
        return cod_Parametro;
    }

    public void setCod_Parametro(String cod_Parametro) {
        this.cod_Parametro = cod_Parametro;
    }

    public Long getQtd_Dia_Secagem() {
        return qtd_Dia_Secagem;
    }

    public void setQtd_Dia_Secagem(Long qtd_Dia_Secagem) {
        this.qtd_Dia_Secagem = qtd_Dia_Secagem;
    }

    public Long getQtd_Dia_Amamentacao() {
        return qtd_Dia_Amamentacao;
    }

    public void setQtd_Dia_Amamentacao(Long qtd_Dia_Amamentacao) {
        this.qtd_Dia_Amamentacao = qtd_Dia_Amamentacao;
    } 
}
