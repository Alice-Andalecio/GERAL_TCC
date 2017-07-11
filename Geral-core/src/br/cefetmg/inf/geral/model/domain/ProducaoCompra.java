package br.cefetmg.inf.geral.model.domain;

public class ProducaoCompra {
    private Long seq_Compra;
    private Long seq_CNPJ;
    private String cod_Problema;
    private String txt_observacao;

    public Long getSeq_Compra() {
        return seq_Compra;
    }

    public void setSeq_Compra(Long seq_Compra) {
        this.seq_Compra = seq_Compra;
    }

    public Long getSeq_CNPJ() {
        return seq_CNPJ;
    }

    public void setSeq_CNPJ(Long seq_CNPJ) {
        this.seq_CNPJ = seq_CNPJ;
    }

    public String getCod_Problema() {
        return cod_Problema;
    }

    public void setCod_Problema(String cod_Problema) {
        this.cod_Problema = cod_Problema;
    }

    public String getTxt_observacao() {
        return txt_observacao;
    }

    public void setTxt_observacao(String txt_observacao) {
        this.txt_observacao = txt_observacao;
    }
}
