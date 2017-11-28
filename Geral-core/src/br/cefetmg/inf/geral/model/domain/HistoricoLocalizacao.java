package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class HistoricoLocalizacao {
    private Long seq_Animal;
    private Date dat_Inicio_Localizacao;
    private Long cod_Setor;

    public Long getSeq_Animal() {
        return seq_Animal;
    }

    public void setSeq_Animal(Long seq_Animal) {
        this.seq_Animal = seq_Animal;
    }

    public Date getDat_Inicio_Localizacao() {
        return dat_Inicio_Localizacao;
    }

    public void setDat_Inicio_Localizacao(Date dat_Inicio_Localizacao) {
        this.dat_Inicio_Localizacao = dat_Inicio_Localizacao;
    }

    public Long getCod_Setor() {
        return cod_Setor;
    }

    public void setCod_Setor(Long cod_Setor) {
        this.cod_Setor = cod_Setor;
    }
}
